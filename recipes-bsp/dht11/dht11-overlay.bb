
SUMMARY = "DHT11 Overlay Recipe"
LICENSE = "CLOSED"

inherit devicetree

SRC_URI = "file://dht11.dts"

do_install(){
    install -d ${D}/boot/overlays
    install -m 0644 ${B}/dht11.dtbo ${D}/boot/overlays
}

COMPATIBLE_MACHINE = "raspberrypi3"
FILES_${PN} = "/boot/overlays/dht11.dtbo"