Sample Yocto Project for building printing support for an ARM64 and x86-64 Linux image
=============================================
This repository provides an example for cross compilation cups, cups-filters and 
gutenprint, and uses core-image-sato / core-image-minimal for a virtual x86-64
and ARM64 qemu machine to test it.

Before trying to use this, please see yocto project quick build for setting up
a native Linux host for building the image.

Below guide expect that your host machine is setup for yocto build.

Backgroup
---------------
This repo is provided as is, in the hope that i can a help for others needing to work
with printing support in yocto.
All of the recipes in this git repo is released under MIT.

Getting Started
---------------
**1.  Clone this repo.**

    $ git clone --recurse-submodules https://github.com/frosteyes/yocto-printing.git

**2.  Setup yocto.**

Copy the template to the build folder and source oe-init-build-env

After you have sourced the setup, please look into the *conf/local.conf* file.
Specifically the variables **DL_DIR** and **SSTATE_DIR** is relevant to save
downloads for later, and prebuild in sstate cache.

**3.  Build image.**

Run bitbake - here we just selet the basic image:

    $ bitbake core-image-sato

First time it takes significant time, as it need to download all the source 
code, compile the host tools and next the complete linux image.

**4.  Run the image in QEMU.**

When the build is done, it is just to run qemu:

    $ runqemu
