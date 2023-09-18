SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Install gpio packages, (rgpio and gpiozero) "
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#Here we are fetching the file 
SRC_URI = "file://install_gpio_packages.sh"

S = "${WORKDIR}"

#In this recipe, fetching will happen, no unpack will happen, no patched will happen.
# we will do_compile

do_install() {
	bbnote "Installing install_gpio_packages Started"
	install -d ${D}${bindir}
	install -m 0755 install_gpio_packages.sh ${D}${bindir}/install_gpio_packages.sh
	bbnote "Installing install_gpio_packages Completed"
}

