SUMMARY = "A image to markoo embedded device"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
#inherit extrausers

IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "204800"

# Change root password
#EXTRA_USERS_PARAMS = "\
#    usermod -P 'markoo_5085' root \
#    "

IMAGE_INSTALL += "markooapp"