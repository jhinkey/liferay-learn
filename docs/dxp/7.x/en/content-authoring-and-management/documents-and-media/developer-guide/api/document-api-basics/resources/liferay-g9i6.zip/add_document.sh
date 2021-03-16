#!/bin/bash

curl -X POST "http://localhost:8080/o/headless-delivery/v1.0/sites/${1}/documents" -u 'test@liferay.com:test' -H "Content-Type: multipart/form-data" -F "file=@${2}"