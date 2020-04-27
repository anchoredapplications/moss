Executive Summary
=================

Computers with multiple operating systems installed, otherwise known as
**multiboot systems**, have become more common over the last few years.
Despite being advantageous in many ways, multiboot systems have a
significant flaw.

The issue relates to navigating between the local operating systems.
There is no elegant way to change the order in which your operatings
systems boot or even which operating system to boot into once you
restart the system. The only current solutions involve navigating the
Unified Extensible Firmware Interface (UEFI) or executing commands on
the terminal. Both of these methods are slow, and both are too complex
to be easily utilized by the general public.

There is, however, a third option. The Multiple Operating System
Superintendent, acronym **MOSS**, is a desktop application that provides
a fast and efficient interface for managing the boot configuration. With
MOSS, you can change boot order quickly and simply, saving time that
would normally be spent on unnecessary boot screens and navigating the
UEFI interface.

Our hope is that our effort in bettering the multi-boot experience will
work to make multibooting more manageable for the general population.
Advances in computer hardware have allowed the technologically
proficient to implement multi-boot systems for years. We believe it is
time that everyone is able to receive the benefits entailed in
multibooting, not just the computer proficient.

Project Definition Document 
===========================

Purpose
-------

Multiple operating system environments have become prevalent both in
industry and in the home, having application on enterprise mainframes as
well as on personal computers. One of the major deficiencies of these
environments is boot speed, and consumers are often slowed by this
schema. Multiple OS environments also suffer from over-complexity, being
too difficult for the general audience. The Multiboot Operating System
Superintendent (MOSS) project is designed to combat both deficiencies.
The MOSS application provides an advanced UEFI management menu that both
minimizes boot time and removes complexity from multiboot environments.

Goals and Objectives
--------------------

Multiple operating system environments have become prevalent both in
industry and in the home, having application on enterprise mainframes as
well as on personal computers. One of the major deficiencies of these
environments is boot speed, and consumers are often slowed by this
schema. Multiple OS environments also suffer from over-complexity, being
too difficult for the general audience. The Multiboot Operating System
Superintendent (MOSS) project is designed to combat both deficiencies.
The MOSS application provides an advanced UEFI management menu that both
minimizes boot time and removes complexity from multiboot environments.

Project Context
---------------

Although there exists other UEFI managers (i.e. Visual BCD Editor) they
are all lacking in some regard. MOSS is unique in that it not only
provides a boot sequence editor, but it also provides a quick-boot panel
for swiftly booting into another operating system or drive partition.
MOSS is also user-friendly, with menus that are easy to navigate.

Expected Benefits 
-----------------

1.  Decreased boot time and complexity on multiboot systems -- Making
    > multiboot systems more useful to consumers, both in industry and
    > in the home.

2.  Encourage users to use multiboot systems by increased efficiency and
    > user-friendliness.

3.  Potentially adding business value to the Linux Foundation and/or
    > Microsoft Corporation

Scope
-----

The MOSS project interacts with local operating systems and superintends
UEFI procedure. As such, this project is highly dependent on the
concurrency of operating system protocol, especially in any future OS
updates. MOSS will take input from the user specifying boot preference
and communicate that to the local operating system. MOSS will not
supersede the operating system's protocol. Instead, MOSS utilizes
existing operating system functionality to the user's benefit, by
increasing efficiency and minimizing complexity. The MOSS project will
also allow the user to fine-tune UEFI settings to better reflect their
preferences.

Stakeholders
------------

1.  The Computer Science Department.

2.  The Linux Foundation.

3.  Microsoft Corporation.

4.  Industries that use multiple operating systems on a day-to-day basis.

5.  Individuals with personal computers.

Success Criteria
----------------

The MOSS project will have been a success if the following criteria are
met according to the listed specifications.

-   Compatible with multiple operating systems (Minimum: Windows 10 and Ubuntu 18.04).

-   Decreases boot time on all compatible operating systems.

-   Project meets all criteria by May 7th, 2020.

If the MOSS project does meet any one of the above criteria, it has
failed.

  **Completed By:**    **Jeremiah Gage**
  -------------------- -------------------
  **Date:**            **4/28/2020**
  **Project Title:**   **MOSS**
  **Reviewed By:**     **Cheri Kembell**

Technical Requirements Document 
===============================

**1. Introduction** 
-------------------

This document contains the system requirements for *MOSS*. These
requirements have been derived from several sources, including
comments/requests from dual-boot users.

1.1 Purpose of This Document
----------------------------

This document is intended to guide development of MOSS. It will go
through several stages during the course of the project:

1.  **Draft:** The first version, or draft version, is compiled after
    requirements have been discovered, recorded, classified, and
    prioritized.

2.  **Proposed:** The draft document is then proposed as a potential
    requirements specification for the project. The proposed document
    should be reviewed by several parties, who may comment on any
    requirements and any priorities, either to agree, to disagree, or
    to identify missing requirements. Readers include end-users,
    developers, project managers, and any other stakeholders. The
    document may be amended and re-proposed several times before
    moving to the next stage.

3.  **Validated:** Once the various stakeholders have agreed to the
    requirements in the document, it is considered validated.

4.  **Approved:** The validated document is accepted by representatives
    of each party of stakeholders as an appropriate statement of
    requirements for the project. The developers then use the
    requirements document as a guide to implementation and to check
    the progress of the project as it develops.

1.2 How to Use This Document
----------------------------

We expect that this document will be used by people with different skill
sets. This section explains which parts of this document should be
reviewed by various types of readers.

### Types of Reader

**• End Users:** Personal computer owners, ETC.

**• Enterprise** **Representatives**: Industry leaders, heads of
development, ETC.

### Technical Background Required

Some experience with operating systems is required. In particular, some
familiarity with multi-boot systems is necessary for understanding the
MOSS project and its applications.

### Overview Sections

**•** 1.3 Scope of the Product

**•** 2. General Description

**•** 2.1 Product Perspective

1.3 Scope of the Product
------------------------

The MOSS project interacts with local operating systems and superintends
UEFI procedure. As such, this project is highly dependent on the
concurrency of operating system protocol, especially in any future OS
updates. MOSS will take input from the user specifying boot preference
and communicate that to the local operating system. MOSS will not
supersede the operating system's protocol. Instead, MOSS utilizes
existing operating system functionality to the user's benefit, by
increasing efficiency and minimizing complexity. The MOSS project will
also allow the user to fine-tune UEFI settings to better reflect their
preferences.

1.4 Business Case for the Product
---------------------------------

Although there exists other UEFI managers (i.e. Visual BCD Editor) they
are all lacking, either being too technical or inefficient to be suited
to a general audience. MOSS is unique in that it not only provides a
boot sequence editor, but it also provides a quick-boot panel for
swiftly booting into another operating system or drive partition. MOSS
is also user-friendly, with menus that are easy to navigate.

MOSS is both applicable and available to all users. Project stakeholders
include:

1.  The Computer Science Department.

2.  The Linux Foundation.

3.  Microsoft Corporation.

4.  Industries that use multiple operating systems on a day-to-day basis.

5.  Individuals with personal computers.

1.5 Overview of the Requirements Document
-----------------------------------------

Benefits of the MOSS project include:

1.  Decreased boot time and complexity on multiboot systems -- Making
    multiboot systems more useful to consumers, both in industry and
    in the home.

2.  Encourage users to use multiboot systems by increased efficiency and
    user-friendliness.

3.  Potentially adding business value to the Linux Foundation and/or
    Microsoft Corporation.

2. General Description
----------------------

This section will give the reader an overview of the project, including
why it was conceived, what it will do when complete, and the types of
people we expect will use it. We also list constraints that were faced
during development and assumptions we made about how we would proceed.

Multiple operating system environments have become prevalent both in
industry and in the home, having application on enterprise mainframes as
well as on personal computers. One of the major deficiencies of these
environments is boot speed, and consumers are often slowed by this
schema. Multiple OS environments also suffer from over-complexity, being
too difficult for the general audience. The Multiboot Operating System
Superintendent (MOSS) project is designed to combat both deficiencies.
The MOSS application provides an advanced UEFI management menu that both
minimizes boot time and removes complexity from multiboot environments.

2.1 Product Perspective
-----------------------

MOSS is a GUI application that functions to increase the accessibility
of multiboot environments by providing an enhanced management
perspective for the Unified Extensible Firmware Interface (UEFI). MOSS
is designed to ease users' workload by providing quick navigation
between operating systems and creating boot behavior that is tailored to
the user's needs. The MOSS program will allow access to system
functionality that is currently only available to users via the terminal
or UEFI directly. This includes, but is not limited to, changing boot
sequence, adding a temporary boot preference, and enabling/disabling
secure boot. MOSS minimizes boot time by removing unnecessary steps in
the boot process.

2.2 Product Functions
---------------------

MOSS allows end-users to switch between a set number of operating
systems located on the quick-launch panel. Local operating systems can
be added to the quick-launch panel via the edit menu panel. From the
edit menu, users can select an operating system from a list of populated
boot options to add to the quick-launch panel. From this menu users may
also set boot preferences, such as disabling secure boot or legacy mode.

2.3 User Characteristics
------------------------

The MOSS software is designed for all computer users who either own a
multiboot system or are interested in creating one. MOSS is also open to
enterprise representatives who utilize multiple operating systems in the
industry environment. MOSS comes with easy-installation features.
However, end-users must maintain administrative access in order to
install operating systems and manage boot settings on the local machine.
Some knowledge of operating systems, mainly installation, is also
required to use the MOSS system.

2.4 Assumptions and Dependencies
--------------------------------

After the conclusion of the MOSS project, distribution of the finished
product will occur over an internet medium. The exact website is still
to be determined. Execution and installation can only be completed by
the local machine administrator. This application is not supported for
those without administrator access. See 3.1-3.3 for full breakdown of
system/user requirements.

3. Specific Requirements
------------------------

This section of the document lists specific requirements for MOSS.
Requirements are divided into the following sections:

1.  User requirements. These are requirements written from the point of
    view of end users, usually expressed in narrative form.

2.  System requirements. These are detailed specifications describing
    the functions the system must be capable of doing.

3.  Interface requirements. These are requirements about the user
    interface, which may be expressed as a list, as a narrative, or as
    images of screen mock-ups.

3.1 User Requirements
---------------------

-   Administrator access.

-   OS installation familiarity.

3.2 System Requirements
-----------------------

-   Primary Operating System: Ubuntu 18.04 or newer.

-   UEFI system with EFI variables enabled.

-   Java JRE 11+

4. Mock-Ups
-----------

The GUI is comprised of two pages. The first page, the quick-start page,
consists of a simple display with the MOSS system's base functionality.
This page is designed to allow the user to quickly switch between
operating systems.

The second page relates to the settings and preferences of the MOSS
application. This page is equipped with a scrolling list of the system's
drives and partitions, and fields illustrating the selected
drive\\partition's information.

5. Glossary 
-----------

-   MOSS -- Multiboot Operating System Superintendent.

-   OS -- Operating System.

-   UEFI---Unified Extensible Firmware Interface.

-   GRUB -- GRand Unified Bootloader

  **Project Name:**      **MOSS**
  ---------------------- -------------------
  **Date:**              **4/28/2020**
  **Prepared By:**       **Jeremiah Gage**
  **Document Status:**   **Approved**
  
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
    > buttons. It boots into the first OS on the boot order. It will not
    > change the boot order next time you restart the PC.

-   **BootSecondary:** The second (left-to-right) of the three main
    > buttons. It boots into the second OS on the boot order. It will
    > not change the boot order next time you restart the PC.

-   **PowerOff:** The last (left-to-right) of the three main buttons. It
    > powers off the system.

-   **Exit:** Located at the top right, it closes the QuickMenu window.

-   **Config:** Located at the top left of the QuickMenu pane, this
    > button takes you to the BootMenu pane.

BootMenu
--------

The BootMenu has three buttons. They are:

-   **Load:** Loads all local boot options to the pane. You will only
    > see boot options that were installed prior to your current boot,
    > so you will need to restart your PC if you want to see any recent
    > additions (i.e. bootable flash drive, etc.).

-   **Boot:** Boots into whatever boot option is currently selected.

-   **Set:** Saves the image path (primary and secondary only) and boot
    > position of the selected boot.

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

  **Project Name:**   **MOSS**
  ------------------- -------------------
  **Date:**           **4/28/2020**
  **Prepared By:**    **Jeremiah Gage**
