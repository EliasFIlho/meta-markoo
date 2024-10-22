SUMMARY = "Picamera2 - Python library for Raspberry Pi cameras"
DESCRIPTION = "Picamera2 provides a Python interface to Raspberry Pi's libcamera library for camera control."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

SRC_URI = "git://github.com/raspberrypi/picamera2.git;protocol=https;branch=main"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit setuptools3



# Dependências
DEPENDS += "libcamera python3-setuptools python3-pip-native python3-jsonschema"

FILES_${PN} += "${libdir}/python3*/site-packages"

do_install() {
    export PIP_DISABLE_PIP_VERSION_CHECK=1
    export PIP_NO_CACHE_DIR=1
    python3 -m pip install . --prefix=${D}${prefix} --no-deps
}

