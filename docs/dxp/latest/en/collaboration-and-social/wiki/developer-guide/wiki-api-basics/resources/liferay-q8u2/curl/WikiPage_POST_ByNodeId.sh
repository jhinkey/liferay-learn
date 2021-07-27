curl \
    -H 'Content-Type: application/json' \
    -X 'POST' \
    "http://localhost:8080/o/headless-delivery/v1.0/wiki-nodes/${1}/wiki-pages" \
    -d "{\"content\": \"This is the page content.\", \"encodingFormat\": \"text/x-wiki\", \"headline\": \"Sample Wiki Page\"}" \
    -u "test@liferay.com:test"