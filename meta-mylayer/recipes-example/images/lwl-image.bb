SUMMARY = "A small boot image for my learning"
LICENSE = "MIT"
inherit core-image

#Adding different image features to the my image
IMAGE_FEATURES += "ssh-server-dropbear debug-tweaks splash tools-debug package-management"
IMAGE_FEATURES += "tools-sdk"

#Installing package group for the image
IMAGE_INSTALL += "packagegroup-core-boot packagegroup-rpi-test" 

IMAGE_INSTALL_append = " packagegroup-base-wifi"

# Set WiFi settings in the image
DISTRO_FEATURES_append = " wifi"

#Installing some package
IMAGE_INSTALL += "usbutils sudo wpa-supplicant"

#Editing what the size of the rootfs should be
IMAGE_ROOTFS_SIZE ?= "8192"
#KERNEL_FEATURES_append = " ufs-support"
#MACHINE_FEATURES += "ufs-support"
IMAGE_NAME = "myimage"

#Add my recipe (mywelcome) to myimage(lwl-image)
IMAGE_INSTALL_append = " mywelcome"

#If you want tocreate image from and existing image i.e you want to reuse an existing image
# reqire recipes-core/images/core-image-minimal.bb      (with this whatever is present in the file willbemade available in my image as well)
# you can now start installing other packages you will want tohave in your own image
#IMAGE_INSTALL += "usbutils" and so on.
