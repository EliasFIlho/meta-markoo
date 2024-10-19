SUMMARY = "A image to markoo embedded device"

IMAGE_LINGUAS = " "
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL += "markooapp"
IMAGE_INSTALL += "python3 python3-pip python3-dev"
IMAGE_INSTALL += "ffmpeg v4l-utils"
IMAGE_INSTALL += "wpa-supplicant  ${MACHINE_EXTRA_RRECOMMENDS}"

IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "204800"
