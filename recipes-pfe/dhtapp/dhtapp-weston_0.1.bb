
SUMMARY = "QT Application for DHT11 Temperature Sensor"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/IbtissemJaffel/QT_Temperature_Chart.git;protocol=https;branch=main"
SRCREV = "7b3ecaa1ed2019879522be75972ea258c9f8e3fc"

DEPENDS += "qtbase"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

inherit qmake5