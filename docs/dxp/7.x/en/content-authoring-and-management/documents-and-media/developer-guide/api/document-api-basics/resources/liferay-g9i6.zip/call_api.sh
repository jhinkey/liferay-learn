#!/bin/bash

function main {

	if [ -z "${1}" ]
	then
		echo "Usage: ./call_api.sh site_id"
		exit 1
	fi

	local site=${1}

	curl -X POST "http://localhost:8080/o/headless-delivery/v1.0/sites/${site}/documents"  -u 'test@liferay.com:test' -H  "accept: application/json" -H  "Content-Type: multipart/form-data" -H  "x-csrf-token: y2i1K2Jo"  -F "file=@./resources/g9i6.txt"

	#curl -X GET "http://localhost:8080/o/headless-delivery/v1.0/sites/${site}/documents" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: Uo5IStBc"

	#curl -X DELETE "http://localhost:8080/o/headless-delivery/v1.0/documents/${document_id}" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: oOZHV70G"
}

main "${@}"