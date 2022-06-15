
SUMMARY = "DHT11 Overlay Recipe"
LICENSE = "CLOSED"

inherit devicetree deploy

SRC_URI = "file://dht11.dts"

do_deploy(){
    install -d ${DEPLOYDIR}
    install -m 0644 ${B}/dht11.dtbo ${DEPLOYDIR}
}

COMPATIBLE_MACHINE = "raspberrypi3"
FILES_${PN} = "/boot/devicetree/dht11.dtbo"