DEFAULTTUNE ?= "powerpc64"

require conf/machine/include/powerpc/arch-powerpc.inc

TUNEVALID[m64] = "Power ELF64 standard ABI"
TUNE_CONFLICTS[m64] = "m32 nf"
TUNE_CCARGS += "${@bb.utils.contains("TUNE_FEATURES", "m64", "-m64", "", d)}"
TUNE_ARCH .= "${@bb.utils.contains("TUNE_FEATURES", [ "m64" ], "powerpc64", "", d)}"

AVAILTUNES += "powerpc64"
TUNE_FEATURES_tune-powerpc64 ?= "m64 fpu-hard"
BASE_LIB_tune-powerpc64 = "lib64"
PACKAGE_EXTRA_ARCHS_tune-powerpc64 = "powerpc64"
