
require recipes-graphics/images/core-image-weston.bb

IMAGE_INSTALL_append = " dhtapp-weston"
IMAGE_INSTALL_append = " dht11-overlay"
IMAGE_INSTALL_append = " dhtapp-python"

RPI_KERNEL_DEVICETREE_OVERLAYS_append = " overlays/dht11.dtbo"