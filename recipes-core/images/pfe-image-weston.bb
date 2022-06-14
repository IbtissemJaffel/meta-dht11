
require recipes-graphics/images/core-image-weston.bb

IMAGE_INSTALL_append = " dhtapp-weston"
IMAGE_INSTALL_append = " dht11-overlay"