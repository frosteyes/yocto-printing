# Recipe for building system-config-printer
# 
# Printer administration for cups 2.4 including automatically installation
# 
# Copyright (c) Ambu A/S - All rights reserved
# system-config-printer is GPLv2 or later - we use it as GPLv2
# This recipe itself is MIT licensed
#
# Author(s)
#   clst@ambu.com (Claus Stovgaard)
#

DESCRIPTION = "system-config-printer - tool for handling printers"
HOMEPAGE = "https://github.com/OpenPrinting/system-config-printer"
LICENSE = "GPLv2+"

SRC_URI = "git://github.com/OpenPrinting/system-config-printer.git;protocol=https;branch=master"
SRCREV = "2c09ddfb25713e38f7a9810193339c7c65c5f2ea"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# Need brokensep because of bootstrap script
# bootstrap also includes autopoint (needing gettext)
inherit autotools-brokensep gettext pkgconfig python3targetconfig

# autoconf-archive-native and desktop-file-utils-native is "meta" tools for
# how the autoconf is written. For the others - see the README.md
DEPENDS += "autoconf-archive-native desktop-file-utils-native \
            cups gettext glib-2.0 libusb python3 systemd"

# See README.md
# python3-core contains /usr/bin/python3
RDEPENDS:${PN} += " \
    python3-core \
    python3-pprint \
    libnotify \
    python3-dbus \
    python3-pycairo \
    python3-pycups \
    python3-pygobject \
"

# Disable generation with xmlto - no need to depend on it
EXTRA_OECONF = "--without-xmlto"

# system-config-printer does not have a configure file in its root folder.
# Rather it has a bootstrap script running the autoconf tools
do_configure() {
    ${S}/bootstrap || bbnote "${PN} failed to bootstrap"
    oe_runconf
}

# pyhton cups-helpers
FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR}/*"
# dbus-1 and metainfo
FILES:${PN} += "${datadir}/*"

