#!/bin/sh

#wpa_passphrase "Pappy_Joe" "@12345678" >> /etc/wpa_supplicant.conf
wpa_passphrase "VIASAT011G" "77tjhfzqyc4g" >> /etc/wpa_supplicant.conf
ifup wlan0

echo "Wifi connected successfully"

#Set the static IP address for wlan0 
ifconfig wlan0 192.168.12.16
echo "Static IP address for wlan0 set successfully"

exit 0 

