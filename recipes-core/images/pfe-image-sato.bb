
require recipes-sato/images/core-image-sato.bb

IMAGE_INSTALL_append = " dhtapp"
IMAGE_INSTALL_append = " dht11-overlay"