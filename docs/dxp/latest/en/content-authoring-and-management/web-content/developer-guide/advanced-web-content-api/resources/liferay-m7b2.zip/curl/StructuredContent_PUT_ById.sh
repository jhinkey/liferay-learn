curl \
	-H "Content-Type: application/json" \
	-X 'PUT' \
	"http://localhost:8080/o/headless-delivery/v1.0/structured-contents/${1}" \
	-u "test@liferay.com:test" \
	--data-binary @- << EOF
		{
			"contentFields" : [ {
			  "contentFieldValue" : {
			  "data" : "Goo"
			  },
			  "name" : "TextReference"
			}, {
			  "contentFieldValue" : {
				"image" : {
					"description" : "Goo alt-image description",
					"id" : "${3}"
				}
			},
			"name" : "ImageReference"
			}, {
			"contentFieldValue" : {
				"data" : "2021-10-30T00:00:00Z"
			},
			"name" : "DateReference"
			}, {
			"contentFieldValue" : {
				"data" : "Goo"
			},
			"name" : "SingleSelectionReference"
			} ],
			"contentStructureId" : "${2}",
			"title" : "Baker Article"
		}
	EOF