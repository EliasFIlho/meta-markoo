SUMMARY = "Hello World, for test recipes in yocto projecto"
DESCRIPTION =  "Custom recipe to do a hello World in python, to teste the build application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


# Where to find sources files (local, github, etc...)

SRC_URI = "file://src"

#Where to keep downloaded source files (in tmp/work/...)
S = "${WORKDIR}/src"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
    ${CC} hello.c -o hello
}

# Create /usr/bin in rootfs and copy program to it

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello ${D}${bindir}
}
