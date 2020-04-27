#!/bin/bash
while true
do
	thisUser=$(head -n 1 /usr/bin/moss_app/bin/user.txt)
        line=$(head -n 1 /home/$thisUser/moss_app/bin/check.txt)
        line2=$(head -n 2 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line3=$(head -n 3 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line4=$(head -n 4 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line5=$(head -n 5 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line6=$(head -n 6 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line7=$(head -n 7 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line8=$(head -n 8 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line9=$(head -n 9 /home/$thisUser/moss_app/bin/check.txt | tail -1)
	line2_1=$(head -n 1 /home/$thisUser/moss_app/bin/paths.txt)
	line2_2=$(head -n 2 /home/$thisUser/moss_app/bin/paths.txt | tail -1)
	line2_3=$(head -n 3 /home/$thisUser/moss_app/bin/paths.txt | tail -1)

        if [ "$line" == "yes" ]
                then
                if [ "$line2" == "0.01" ]
                        then
                        sed -i 's/GRUB_TIMEOUT=10/GRUB_TIMEOUT=0.01/g' /etc/default/grub
                        else
                        sed -i 's/GRUB_TIMEOUT=0.01/GRUB_TIMEOUT=10/g' /etc/default/grub
                fi
                sudo update-grub
        	sed -i 's/yes/no/g' /home/$thisUser/moss_app/bin/check.txt
	fi
        if [ "$line3" == "yes1" ]
                then
               	sudo efibootmgr -n $line4
        	sed -i 's/yes1/no1/g' /home/$thisUser/moss_app/bin/check.txt
	fi
        if [ "$line5" == "rebootYes" ]
                then
		sed -i 's/rebootYes/rebootNo/g' /home/$thisUser/moss_app/bin/check.txt
               	reboot
        	
	fi
        if [ "$line6" == "powerOff" ]
                then
		sed -i 's/powerOff/powerOn/g' /home/$thisUser/moss_app/bin/check.txt
               	poweroff
        	
	fi
        if [ "$line7" == "loadDrivesYes" ]
                then
		sed -i 's/loadDrivesYes/loadDrivesNo/g' /home/$thisUser/moss_app/bin/check.txt
		sudo efibootmgr > /home/$thisUser/moss_app/bin/bootNums.txt
        	
	fi
        if [ "$line8" == "reorderYes" ]
                then
		sudo efibootmgr -o $line9
		sed -i 's/reorderYes/reorderNo/g' /home/$thisUser/moss_app/bin/check.txt
		sudo efibootmgr > /home/$thisUser/moss_app/bin/bootNums.txt
        	
	fi
        if [ "$line2_1" == "imageChanged" ]
                then
		sed -i 's/imageChanged/imageNotChanged/g' /home/$thisUser/moss_app/bin/paths.txt
		cp -r $line2_2 /usr/bin/moss_app/bin/OS_Ubuntu.png
		cp -r $line2_3 /usr/bin/moss_app/bin/OS_Windows.png
        	
	fi
        echo Changes made at $(date)
        sleep 0.1
done

