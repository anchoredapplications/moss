
What is MOSS?
=================
The Multiple Operating System Superintendent, acronym **MOSS**, is an open-source 
desktop application that provides
a fast and efficient interface for managing the boot configuration on Linux systems. With
MOSS, you can change boot order quickly and simply, saving time that
would normally be spent on unnecessary boot screens and navigating the
UEFI interface.

Our hope is that our effort in bettering the multi-boot experience will
work to make multibooting more manageable for the general population.
Advances in computer hardware have allowed the technologically
proficient to implement multi-boot systems for years. We believe it is
time that everyone is able to receive the benefits entailed in
multibooting, not just the computer proficient.

Why MOSS?
=================

Computers with multiple operating systems installed, otherwise known as
**multiboot systems**, have become more common over the last few years.
Despite being advantageous in many ways, multiboot systems have some
significant flaws.

One issue relates to navigating between the local operating systems.
There is no elegant way to change the order in which your operatings
systems boot or even which operating system to boot into once you
restart the system. The only current solutions involve navigating the
Unified Extensible Firmware Interface (UEFI) or executing commands on
the terminal. Both of these methods are slow, and both are too complex
to be easily utilized by the general public.

We created MOSS as an easy-to-use solution to this problem. The bestpart? It's free. 
Follow the link above to access our github and download MOSS today. 


User's Manual
=============

Requirements
------------

### System Requirements

MOSS was designed for Ubuntu 19.10 or newer installations, but should
work on similar Linux distros.

### Program Dependencies

The MOSS system needs the Java Runtime Environment 11+ in order to run.
If you do not have JRE 11+ or newer installed, you can install it with
by opening a terminal window and entering the following text:

*sudo apt install default-jre*

And follow the resulting prompts.

Installation
------------

Download the MOSS application and save the folder to a location where
you can easily access it. Once saved, you can install MOSS with the
following steps:

1.  Open the folder and right-click in any open space.

2.  Select "Open in terminal"

3.  Type *./install.sh*

That's it, MOSS is now installed! You can now run MOSS by clicking on it
in the app launcher.

Note: You can uninstall MOSS anytime by repeating the steps, but
replacing *./install.sh* with *./uninstall.sh* in the third step.

Set Up
------

The first time you run MOSS, you may have to change a few things to make
the application work effectively. If this is the first time starting the
app, you should:

-   Make sure Ubuntu is your Primary OS. To do that, follow the steps on
    **Change Boot Order.**

-   Make sure your boot images are correct. See **Change Image.**

QuickMenu
---------

The QuickMenu has five buttons. They are:

-   **BootPrimary:** The first (left-to-right) of the three main
    buttons. It boots into the first OS on the boot order. It will not
    change the boot order next time you restart the PC.

-   **BootSecondary:** The second (left-to-right) of the three main
    buttons. It boots into the second OS on the boot order. It will
    not change the boot order next time you restart the PC.

-   **PowerOff:** The last (left-to-right) of the three main buttons. It
    powers off the system.

-   **Exit:** Located at the top right, it closes the QuickMenu window.

-   **Config:** Located at the top left of the QuickMenu pane, this
    button takes you to the BootMenu pane.

BootMenu
--------

The BootMenu has three buttons. They are:

-   **Load:** Loads all local boot options to the pane. You will only
    see boot options that were installed prior to your current boot,
    so you will need to restart your PC if you want to see any recent
    additions (i.e. bootable flash drive, etc.).

-   **Boot:** Boots into whatever boot option is currently selected.

-   **Set:** Saves the image path (primary and secondary only) and boot
    position of the selected boot.

Change Image
------------

For this example, we are going to change the image associated with our
secondary boot: "Windows Boot Manager". You can only change the images
of the Primary and Secondary boots, as they are the only two that appear
on the QuickMenu.

1.  After opening the MOSS app, click the gear icon at the top left
    corner of the QuickMenu.

2.  You should now see the BootMenu.

3.  Click "Load" to load all local boot options to the pane.

4.  In our scenario, we have "Ubuntu", "Windows Boot Manager", "EFI USB
    Device", "EFI DVD/CDROM", and "EFI Network" as our boot options.
    "Windows Boot Manager" is in our secondary (\#2) position, and we
    want to change the image associated with it.

5.  Click on the "Windows Boot Manager" entry on the BootOrder pane.

6.  While "Windows Boot Manager" is selected, navigate to the left side
    of the pane and paste the path to the new image in the text box.
    Then click "Set".

7.  Close all MOSS tabs and reopen the app. The new image should now be
    on the second button in the QuickMenu.

Change Boot Order
-----------------

For this example, we are going to change "Ubuntu" to our primary boot,
or boot \#1, but you follow the same steps to change any "OS" to
position \#X.

1.  After opening the MOSS app, click the gear icon at the top left
    corner of the QuickMenu (as seen below).

2.  You should now see the BootMenu (as seen below).

3.  Click "Load" to load all local boot options to the pane.

4.  In our scenario, we have "Windows Boot Manager", "Ubuntu", "EFI USB
    Device", "EFI DVD/CDROM", and "EFI Network" as our boot options.

5.  Click on the "Ubuntu" entry on the BootOrder pane.

6.  While "Ubuntu" is selected, navigate to the left side of the pane
    and select the dropdown box. Select \#1 and press the "Set"
    button.

7.  Hit "Load" again, "Ubuntu" should be at the top of the list as seen
    in the first photo. It is now in the Primary, or \#1 position.

Link to tutorial: https://www.youtube.com/watch?v=NkE7mKvBHmE
