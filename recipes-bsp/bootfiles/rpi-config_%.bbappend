
do_deploy_append(){
    echo "dtoverlay=dht11,gpiopin=4" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}