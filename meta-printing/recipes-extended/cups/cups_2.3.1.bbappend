# Adaptation of cups from poky
# 
# Copyright (c) Ambu A/S - All rights reserved
#
# Author(s)
#   clst@ambu.com (Claus Stovgaard)
#


# This is upstreamed to master of poky (oe-core)
# Don't know if it will be backported to dunfell.
# It fixes an issue with init scripts not being installed.
# See mail list / git for further info.
# https://lists.openembedded.org/g/openembedded-core/message/158252
# https://git.yoctoproject.org/cgit/cgit.cgi/poky/commit/?id=6c220ed3f411b73d2e80e15de71d022d58db2232
PACKAGECONFIG[systemd] = "--with-systemd=${systemd_system_unitdir},--disable-systemd,systemd"

