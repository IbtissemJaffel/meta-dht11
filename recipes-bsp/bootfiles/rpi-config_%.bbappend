
do_deploy_append(){
    if [ ${ENABLE_DHT11_DRIVER} == "1" ]; then
        echo "dtoverlay=dht11,gpiopin=4" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    fi
}