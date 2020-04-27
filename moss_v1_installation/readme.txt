 .----------------.  .----------------.  .----------------.  .----------------. 
| .--------------. || .--------------. || .--------------. || .--------------. |
| | ____    ____ | || |     ____     | || |    _______   | || |    _______   | |
| ||_   \  /   _|| || |   .'    `.   | || |   /  ___  |  | || |   /  ___  |  | |
| |  |   \/   |  | || |  /  .--.  \  | || |  |  (__ \_|  | || |  |  (__ \_|  | |
| |  | |\  /| |  | || |  | |    | |  | || |   '.___`-.   | || |   '.___`-.   | |
| | _| |_\/_| |_ | || |  \  `--'  /  | || |  |`\____) |  | || |  |`\____) |  | |
| ||_____||_____|| || |   `.____.'   | || |  |_______.'  | || |  |_______.'  | |
| |              | || |              | || |              | || |              | |
| '--------------' || '--------------' || '--------------' || '--------------' |
 '----------------'  '----------------'  '----------------'  '----------------'
------------------------------------------------------------------
System Requirements

MOSS was designed for Ubuntu 19.10 or newer installations, but should work on similar Linux distros. 
------------------------------------------------------------------
Program Dependencies

The MOSS system needs the Java Runtime Environment 11+ in order to run. If you do not have JRE 11+ or newer installed, you can install it with by opening a terminal window and entering the following text:

sudo apt install default-jre 

And follow the resulting prompts. 
------------------------------------------------------------------
Installation

Download the MOSS application zip folder (moss_v1_installation.zip) and extract the folder to a location where you can easily access it. Once extracted, you can install MOSS with the following steps:

 1. Open the folder and right-click in any open space. 
 2. Select “Open in terminal” 
 3. Type ./install.sh

That’s it, MOSS is now installed! You can now run MOSS by clicking on it in the app launcher.
Note: You can uninstall MOSS anytime by repeating the steps but typing replacing ./install.sh with ./uninstall.sh  on the third step.

------------------------------------------------------------------
Dear Developers and the Tech-Savy

MOSS removes the 10-sec boot menu from the beginning of the Ubuntu boot screen. Unless you are messing with boot-config probably wont miss it. However, if you do, you can get it back without uninstalling MOSS by typing:

sed -i 's/no/yes/g' /home/$USER/moss_app/bin/check.txt
sed -i 's/0.01/10/g' /home/$USER/moss_app/bin/check.txt

into the terminal.


