SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Install gpio packages, (rgpio and gpiozero) "
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#Here we are fetching the file 
SRC_URI = "file://install_gpio_packages.sh \
	   file://install-gpio-packages.service \
	  "

inherit systemd

S = "${WORKDIR}"

SYSTEMD_SERVICE_${PN} += "install-gpio-packages.service"

#In this recipe, fetching will happen, no unpack will happen, no patched will happen.
# we will do_compile

do_install() {
	bbnote "Installing install_gpio_packages Started"
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/systemd/system

	install -m 0755 install_gpio_packages.sh ${D}${sysconfdir}/init.d/
	install -m 0755 install-gpio-packages.service ${D}${sysconfdir}/systemd/system/
	bbnote "Installing install_gpio_packages Completed"
}
#enable the service
FILES_${PN} += " \
    ${sysconfdir}/systemd/system/install-gpio-packages.service \
"

