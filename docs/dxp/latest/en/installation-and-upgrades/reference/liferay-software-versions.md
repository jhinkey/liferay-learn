# Liferay Software Versions

Liferay Portal and Liferay DXP releases use three to four version numbers. The first number represent the major, minor, and micro version. For the micro version, Portal uses one digit while DXP uses two digits. Portal and DXP use the fourth number differently too.

| Software | Micro Version | Fourth Number |
| :------- | :------------ | :------------ |
| Liferay Portal | One digit | GA release number |
| Liferay DXP | Two digits | Service Pack number; nothing if before the first Service Pack |

## Liferay Portal Versioning

Here are some hpyothetical Liferay Portal version examples:

```
7.4.3.4 Portal GA 4
7.4.3.5 Portal GA 5
...
7.4.3.100 Portal GA 100
```

The fourth version number is always the GA release number.

## Liferay DXP Versioning

Here are some hpyothetical Liferay DXP version examples:

```
7.4.13 DXP GA1
7.4.13 DXP GA1 FP1
7.4.13 DXP GA1 FP2
7.4.13 DXP GA1 FP3
7.4.13.1 DXP GA1 FP4/SP1
...
7.4.13.2 DXP GA1 FP8/SP2
```

If the release is a Service Pack (or built on a Service Pack), the fourth number is the Service Pack number. For example, the `7.4.13.1 DXP GA1 FP4/SP1` release uses `1` as the fourth number to represent Service Pack 1.

```{note}
Versions prior to the DXP software's first Service Pack exclude a fourth version number.
```

## Additional Information

* [Docker Image Versions](../installing-liferay/using-liferay-docker-images/docker-image-versions.md)
* [Hosting Liferay](../installing-liferay/hosting-liferay.md)
* [Patching Liferay](../maintaining-a-liferay-dxp-installation/patching-liferay/patching-liferay.md)