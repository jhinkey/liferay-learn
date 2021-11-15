#!/bin/bash

for file_name in `find . -type f -name "*.md"`
do
	python convert_admonitions.py ${file_name}
done