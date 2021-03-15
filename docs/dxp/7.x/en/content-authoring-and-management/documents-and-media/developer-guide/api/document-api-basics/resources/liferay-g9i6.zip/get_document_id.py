import json
import sys

document_title = sys.argv[1]
json_file = sys.argv[2]

with open(json_file) as f:
	data = json.load(f)

id=''

for item in data['items']:
	if item['title'] == document_title:
		id = item['id']
		break

if id != '':
	print(id)