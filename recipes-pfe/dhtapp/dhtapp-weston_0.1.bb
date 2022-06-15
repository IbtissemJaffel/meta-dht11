
SUMMARY = "QT Application for DHT11 Temperature Sensor"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/IbtissemJaffel/QT_Temperature_Chart.git;protocol=https;branch=main"
SRCREV = "729c37f94f1217483381cda1905ead369a479e34"

DEPENDS += "qtbase qtcharts"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}/git"

inherit qmake5

FILES_${PN} = "/opt/Temperature/bin/Temperature"