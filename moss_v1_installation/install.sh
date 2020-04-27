#!/bin/bash
sudo cp -r moss_app/ /home/$USER/
sudo cp -r moss_app/ /usr/bin/
sudo cp -r moss_app/bin/services/moss.service /etc/systemd/system/
sudo cp -r moss_app/bin/moss.desktop /usr/share/applications/ 
sudo chmod -x /usr/share/applications/moss.desktop
sudo systemctl daemon-reload
sudo systemctl enable moss.service
sudo systemctl start moss.service
sudo chmod -x /usr/bin/moss_app/moss_application.jar
sudo chmod -x /home/$USER/moss_app/moss_application.jar
sudo chown -R $USER /home/$USER/moss_app/
sudo echo $USER > /home/$USER/moss_app/bin/user.txt
sudo cp -r /home/$USER/moss_app/bin/user.txt /usr/bin/moss_app/bin/user.txt
sed -i 's/no/yes/g' /home/$USER/moss_app/bin/check.txt
sed -i 's/10/0.01/g' /home/$USER/moss_app/bin/check.txt
sudo cat ascii.txt
