# Adaptation of cups from poky
# 
# Copyright (c) Ambu A/S - All rights reserved
#
# Author(s)
#   clst@ambu.com (Claus Stovgaard)
#

# Enable root to be system group, beside the lpadmin group
EXTRA_OECONF += " --with-system-groups='lpadmin root' "
