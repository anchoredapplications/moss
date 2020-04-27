#!/bin/bash
sed -i 's/no/yes/g' /home/$USER/moss_app/bin/check.txt
sed -i 's/0.01/10/g' /home/$USER/moss_app/bin/check.txt
sudo rm -r /home/$USER/moss_app
sudo systemctl stop moss.service
sudo rm -r /etc/systemd/system/moss.service
sudo rm -r /usr/share/applications/moss.desktop  

