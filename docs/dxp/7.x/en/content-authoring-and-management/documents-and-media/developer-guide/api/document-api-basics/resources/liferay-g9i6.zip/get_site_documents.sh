#!/bin/bash

curl -X GET "http://localhost:8080/o/headless-delivery/v1.0/sites/${1}/documents" -u 'test@liferay.com:test' -H "accept: application/json" -H "x-csrf-token: Uo5IStBc"