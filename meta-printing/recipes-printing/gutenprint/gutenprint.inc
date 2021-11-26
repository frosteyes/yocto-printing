# common part for gutenprint-native / gutenprint
#
# As we are using the native part for generating string header to the target
# version, it is important they use the same version.
# So we set the SRC_URI and SRCREV here.
# 
# Copyright (c) Ambu A/S - All rights reserved
# gutenprint is GPLv2 or later - we use it as GPLv2
# This recipe itself is MIT licensed
#
# Author(s)
#   clst@ambu.com (Claus Stovgaard)
#

DESCRIPTION = "Gutenprint printer drivers"
HOMEPAGE = "http://gimp-print.sourceforge.net/"
LICENSE = "GPLv2"

SRC_URI = "git://git.code.sf.net/p/gimp-print/source;protocol=https"
SRCREV = "4543297967c3c77fa411a819149a02980f576dc6"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
