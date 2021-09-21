#!/bin/bash

readonly LIFERAY_LEARN_COMMERCE_DOCKER_IMAGE_TOKEN=\\[\$LIFERAY_LEARN_COMMERCE_DOCKER_IMAGE\$\\]
readonly LIFERAY_LEARN_COMMERCE_DOCKER_IMAGE_VALUE=liferay\\/commerce\\:2.0.5
readonly LIFERAY_LEARN_COMMERCE_GIT_TAG_TOKEN=\\[\$LIFERAY_LEARN_COMMERCE_GIT_TAG\$\\]
readonly LIFERAY_LEARN_COMMERCE_GIT_TAG_VALUE=2.0.5
readonly LIFERAY_LEARN_COMMERCE_WORKSPACE_TOKEN=
readonly LIFERAY_LEARN_GENERAL_DOCKER_IMAGE_TOKEN=\\[\$LIFERAY_LEARN_GENERAL_DOCKER_IMAGE\$\\]
readonly LIFERAY_LEARN_DXP_API_TOKEN=release.dxp.api
readonly LIFERAY_LEARN_DXP_DOCKER_IMAGE_TOKEN=\\[\$LIFERAY_LEARN_DXP_DOCKER_IMAGE\$\\]
readonly LIFERAY_LEARN_DXP_DOCKER_IMAGE_VALUE=liferay\\/dxp\\:7.3.10-dxp-2
readonly LIFERAY_LEARN_DXP_WORKSPACE_TOKEN=dxp-7.3-sp2
readonly LIFERAY_LEARN_PORTAL_API_TOKEN=release.portal.api
readonly LIFERAY_LEARN_PORTAL_DOC_FILE_NAME=liferay-ce-portal-doc-7.4.1-ga2-20210609223456272.zip
readonly LIFERAY_LEARN_PORTAL_DOCKER_IMAGE_TOKEN=\\[\$LIFERAY_LEARN_PORTAL_DOCKER_IMAGE\$\\]
readonly LIFERAY_LEARN_PORTAL_DOCKER_IMAGE_VALUE=liferay\\/portal\\:7.4.1-ga2
readonly LIFERAY_LEARN_PORTAL_GIT_TAG_TOKEN=\\[\$LIFERAY_LEARN_PORTAL_GIT_TAG\$\\]
readonly LIFERAY_LEARN_PORTAL_GIT_TAG_VALUE=7.4.1-ga2
readonly LIFERAY_LEARN_PORTAL_WORKSPACE_TOKEN=portal-7.4-ga2

readonly LIFERAY_LEARN_GENERAL_API_TOKEN="${LIFERAY_LEARN_PORTAL_API_TOKEN}"
readonly LIFERAY_LEARN_GENERAL_DOCKER_IMAGE_VALUE="${LIFERAY_LEARN_PORTAL_DOCKER_IMAGE_VALUE}"
readonly LIFERAY_LEARN_GENERAL_WORKSPACE_TOKEN="${LIFERAY_LEARN_PORTAL_WORKSPACE_TOKEN}"

function download_nexus_jar {
	curl -L "https://repository-cdn.liferay.com/nexus/service/local/artifact/maven/redirect?a=${1}&g=com.liferay&r=liferay-public-releases&v=LATEST" -o $(ls -d liferay*.zip | head -n1)/java/${1}.jar
}