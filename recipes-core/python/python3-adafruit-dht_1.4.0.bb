
SUMMARY = "Library to get readings from the DHT11, DHT22, and AM2302 humidity and temperature sensors on a Raspberry Pi or Beaglebone Black."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_DHT/"
AUTHOR = "Tony DiCola <tdicola@adafruit.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=b502ec545556c4de98512828d2b7f7b6"

SRC_URI = "https://files.pythonhosted.org/packages/ff/24/b999708edffbc3d30763acdf07dc7a1666a1542795f3d2b80d6ef2590c0c/Adafruit_DHT-1.4.0.tar.gz"
SRC_URI[md5sum] = "1880a3780819bd0bc0663bfc54cdc605"
SRC_URI[sha256sum] = "e927f2232eff5335cb9d8a2cca6dcad4625e61f205b12e31ef04198ea6dec830"

S = "${WORKDIR}/Adafruit_DHT-1.4.0"

RDEPENDS_${PN} = ""

inherit setuptools3

DISTUTILS_INSTALL_ARGS_append = " --force-pi"