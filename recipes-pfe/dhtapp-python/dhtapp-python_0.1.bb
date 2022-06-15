
SUMMARY = "Adafruit DHT11 Python Application"
LICENSE = "CLOSED"

SRC_URI = "file://dht11app.py"

do_install(){
    install -d ${D}/opt/Temperature/bin
    install -m 0644 ${WORKDIR}/dht11app.py ${D}/opt/Temperature/bin
}

FILES_${PN} = "/opt/Temperature/bin/dht11app.py"