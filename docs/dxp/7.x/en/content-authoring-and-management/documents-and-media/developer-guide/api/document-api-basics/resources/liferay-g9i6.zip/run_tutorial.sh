#!/bin/bash

function main {

	if [ -z "${1}" ]
	then
		echo "Usage: ./run_tutorial.sh site_id"
		exit 1
	fi

	local site=${1}

	local title="g9i6.txt"

	echo "Get documents with title ${title} for site ${site}"

	local section_separator="##########"

	##
	## Get site documents
	##

	local get_site_documents_response="get_site_documents_response.json"

	curl -X GET "http://localhost:8080/o/headless-delivery/v1.0/sites/${site}/documents" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: Uo5IStBc" --output ${get_site_documents_response}

	##
	## Get the document's id
	##

	local document_id="$(python ./get_document_id.py ${title} ${get_site_documents_response})"

	if [ -z "${document_id}" ]
	then
		echo "No document found with title ${title}"
		echo "${section_separator}"
		echo "Add document with title ${title}"

		##
		## Add document to site
		##

		curl -X POST "http://localhost:8080/o/headless-delivery/v1.0/sites/20121/documents"  -u 'test@liferay.com:test' -H  "accept: application/json" -H  "Content-Type: multipart/form-data" -H  "x-csrf-token: y2i1K2Jo"  -F "file=@./resources/${title}"

		##
		## Get the document's id
		##

		curl -X GET "http://localhost:8080/o/headless-delivery/v1.0/sites/${site}/documents" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: Uo5IStBc" --output ${get_site_documents_response}

		document_id="$(python ./get_document_id.py ${title} ${get_site_documents_response})"
	fi

	echo "Document ${title} has id ${document_id}"
	echo "${section_separator}"

	##
	## Get the JSON for the document
	##

	local get_document_response="get_document_response.json"

	curl -X GET "http://localhost:8080/o/headless-delivery/v1.0/documents/${document_id}" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: oOZHV70G" --output ${get_document_response}

	echo "Here is the JSON for document with id ${document_id}: $(cat ${get_document_response})"
	echo "${section_separator}"

	##
	## Delete the document
	##

	echo "Delete document with id ${document_id}"

	curl -X DELETE "http://localhost:8080/o/headless-delivery/v1.0/documents/${document_id}" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: oOZHV70G"

	##
	## Try to get the document
	##

	curl -X GET "http://localhost:8080/o/headless-delivery/v1.0/documents/${document_id}" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: oOZHV70G" --output ${get_document_response}

	echo "${section_separator}"

	echo "Here is the JSON for document with id ${document_id}: $(cat ${get_document_response})"
}

main "${@}"