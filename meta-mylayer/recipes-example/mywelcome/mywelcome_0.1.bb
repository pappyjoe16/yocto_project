SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Simple Hello and welcome note C application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#Here we are fetching the file 
SRC_URI = "file://welcome.c"

S = "${WORKDIR}"

#In this recipe, fetching will happen, no unpack will happen, no patched will happen.
# we will do_compile

do_compile() {
	${CC} welcome.c ${LDFLAGS} -o welcome
}

#We install the output binary 
do_install() {
	install -d ${D}${bindir}
	install -m 0755 welcome ${D}${bindir}
}

