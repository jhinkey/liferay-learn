#!/bin/bash

curl -X DELETE "http://localhost:8080/o/headless-delivery/v1.0/documents/${1}" -u 'test@liferay.com:test' -H  "accept: application/json" -H  "x-csrf-token: oOZHV70G"