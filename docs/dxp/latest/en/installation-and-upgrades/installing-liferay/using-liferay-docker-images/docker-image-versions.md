# Liferay Docker Image Versions

Liferay Docker image tags begin with a Liferay software version and end with an image version.

`[Liferay software version]-[image version]`

The Liferay software version has a major, minor, and micro version number, a possible fourth number, and a DXP FP/SP number (e.g., `7.3.10-dxp-2`) or Portal GA number (`7.4.3.4-ga4`). For details, please see [Liferay Software Versions](../../reference/liferay-software-versions.md).

Liferay Docker image tags use *full* image versions and *simple* image versions.

A full image version is semantic version based on changes to the container (e.g., OS, scripts, and tools). These versions start with `d`, have a major, minor, and micro version number, and end with a timestamp (e.g., `d2.0.4-20211022091811`).

```{important}
The image version is not bound by the Liferay software version. For example, multiple images can be created for the same Liferay software version.
```

The tags that use the full image version are recommended because they're static and explicitly versioned.

The tags that use the simple image version are provided only as a convenience. They represent the *latest image available* for a Liferay software version.

For example, here are the full and simple version tags used for the DXP 7.4 early preview (EP) image available at the time of this writing.

Full:

```
7.4.12-ep3-d2.0.4-20211022092046
```

Simple:

```
7.4.12-ep3
```

The full and simple tags above refer to the same Docker image. If, however, a new image is created for the 7.4.12 EP3 software, the simple tag is updated to use the new image.

```{warning}
Liferay Docker image tags that use a simple image version can change. They are updated to refer to the latest image available for the Liferay software version.
```

## Additional Information

* [Liferay Software Versions](../../reference/liferay-software-versions.md)
* [Docker Container Basics](./docker-container-basics.md)
* [Upgrading to a New Docker Image](./upgrading-to-a-new-docker-image.md)