#!/bin/bash

# Pre-process Markdown files

function slurp_code {
	if [[ -f ${1} ]]
	then
		# TODO Reduce the tokens to a set
		# TODO get token line number to use in log messages
		for slurp_token in `grep "\@slurp" ${1}`
		do
			local file=`echo ${slurp_token} | awk -F ':' '{print $2}' | xargs`
			if [[ ! -f ${file} ]]
			then
				echo "Slurp token file not found:  ${slurp_token}"
				continue
			fi

			local code=$(cat ${file})
			local line_count=`cat ${file} | wc -l`
			local extension=`echo ${file} | awk -F '.' '{print $2}' | xargs`
			
			local range=`echo ${slurp_token} | awk -F ':' '{print $3}' | xargs`
		
			local start=`echo ${range} | awk -F ',' '{print $1}' | xargs`

			local num_regex='^[0-9]+$'
	
			if [[ -n ${start} ]] && [[ ${start} =~ ${num_regex} ]] && [[ ${start} -le ${line_count} ]]
			then

				if [[ ${start} -le 0 ]]
				then
					start=1
				fi

				code=$(sed -n "${start},\$p" ${file})

				local end=`echo ${range} | awk -F ',' '{print $2}' | xargs`

				if [[ -n ${end} ]] && [[ ${end} =~ ${num_regex} ]] && [[ ${end} -ge ${start} ]]
				then

					if [[ ${end} -le 0 ]]
					then
						end=1
					fi

					if [[ ${end} -lt ${line_count} ]]
					then
						code=$(sed -n "${start},${end}p;$((${end} + 1))q" ${file})
					fi
				fi
			fi

			# echo "code ${code//$'\n'/\\n}"
			local code_start="\`\`\`${extension}\n"
			local code_end="\n\`\`\`"

			# TODO use the -i options... 
			sed -i "s/$slurp_token/${code_start}${code//$'\n'/\\n}${code_end}/g" ${1}
			# sed "s/$slurp_token/${code_start}${code//$'\n'/\\n}${code_end}/g" ${1}
		done
	fi
	
	
}

function main {
	echo ${1}
	slurp_code ${1}
}

main "${@}"