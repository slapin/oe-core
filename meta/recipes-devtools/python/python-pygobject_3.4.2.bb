DESCRIPTION = "Python GObject bindings"
SECTION = "devel/python"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=a916467b91076e631dd8edb7424769c7"
DEPENDS = "python python-pygobject-native glib-2.0"
DEPENDS_virtclass-native = "glib-2.0-native"
RDEPENDS_virtclass-native = ""
PR = "r5"

MAJ_VER = "${@d.getVar('PV',1).split('.')[0]}.${@d.getVar('PV',1).split('.')[1]}"

SRC_URI = "${GNOME_MIRROR}/pygobject/${MAJ_VER}/pygobject-${PV}.tar.xz"

SRC_URI[md5sum] = "a17b3897507f179d643e02f5abf111ac"
SRC_URI[sha256sum] = "2b87ef3170be3a20a53fbdb348ae4ecb41a72a17ec6531baa67147c3437d2aad"
S = "${WORKDIR}/pygobject-${PV}"

FILESPATH = "${FILE_DIRNAME}/python-pygobject:${FILE_DIRNAME}/files"
EXTRA_OECONF += "--disable-introspection"

inherit autotools distutils-base pkgconfig

# necessary to let the call for python-config succeed
export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

PACKAGES += "${PN}-lib"

RDEPENDS_${PN} += "python-textutils"

FILES_${PN} = "${libdir}/python*"
FILES_${PN}-lib = "${libdir}/lib*.so.*"
FILES_${PN}-dev += "${bindir} ${datadir}"

BBCLASSEXTEND = "native"
