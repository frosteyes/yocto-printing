# Python bindings for the libcups library from the CUPS project.
# 
# Copyright (c) Ambu A/S - All rights reserved
# pycups is GPLv2 or later - we use it as GPLv2
# This recipe itself is MIT licensed
#
# Author(s)
#   clst@ambu.com (Claus Stovgaard)
#

DESCRPTION = "pycups - CUPS bindings for Python"
HOMEPAGE = "https://github.com/OpenPrinting/pycups"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
LICENSE = "GPLv2+"

# See https://pypi.org/project/pycups/ for data
SRC_URI[sha256sum] = "57434ce5f62548eb12949ca8217f066f4eeb21a5d6ab8b13471dce350e380c90"

inherit pypi setuptools3

DEPENDS += "cups"
