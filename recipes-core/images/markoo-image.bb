SUMMARY = "A image to markoo embedded device"

IMAGE_LINGUAS = " "
LICENSE = "MIT"

inherit core-image

#Basic for image
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

#Python interpreter
IMAGE_INSTALL += "python3 python3-dev python3-jsonschema python3-pip"

#Video stuff
IMAGE_INSTALL += "ffmpeg v4l-utils libcamera python3-numpy python3-pillow picamera2"

#Network stuff
IMAGE_INSTALL += "wpa-supplicant  ${MACHINE_EXTRA_RRECOMMENDS}"

#Audio stuff
IMAGE_INSTALL += "python3-pyaudio"

#Makoo application
IMAGE_INSTALL += "markooapp"


IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "204800"
