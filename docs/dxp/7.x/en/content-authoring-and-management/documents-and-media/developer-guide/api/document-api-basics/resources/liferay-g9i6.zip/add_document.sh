#!/bin/bash

curl -X POST "http://localhost:8080/o/headless-delivery/v1.0/sites/${1}/documents"  -u 'test@liferay.com:test' -H  "accept: application/json" -H  "Content-Type: multipart/form-data" -H  "x-csrf-token: y2i1K2Jo"  -F "file=@${2}"