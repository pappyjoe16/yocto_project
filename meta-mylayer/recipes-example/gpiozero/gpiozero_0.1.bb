DESCRIPTION = "Python library for GPIO control"
#HOMEPAGE = "https://gpiozero.readthedocs.io/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pypi
inherit pypi setuptools3
inherit pypi distutils3

SRC_URI = "file://gpiozero-1.6.2.tar.gz"
SRC_URI[md5sum] = "75cec80dc1caceacc33dbf856b104bc0"
SRC_URI[sha256sum] = "35c4381cb201c08c4ed461a5ca7540eb1f224c0e8a96bf2073a1dd5310d5533e"


DEPENDS += "python3-setuptools"

#S = "${WORKDIR}/"

RDEPENDS_${PN} += "python3"
