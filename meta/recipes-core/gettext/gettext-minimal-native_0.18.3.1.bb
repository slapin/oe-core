SUMMARY = "Minimal gettext for supporting native autoconf/automake"
DESCRIPTION = "Contains the m4 macros sufficient to support building \
autoconf/automake. This provides a significant build time speedup by \
the removal of gettext-native from most dependency chains (now only \
needed for gettext for the target)."
SRC_URI = "file://aclocal.tgz \
           file://config.rpath \
           file://Makefile.in.in \
           file://remove-potcdate.sin \
           file://COPYING"

INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_AUTOTOOLS_DEPS = "1"

LICENSE = "FSF-Unlimited"
LIC_FILES_CHKSUM = "file://COPYING;md5=0854da868a929923087141d9d7aba7d5"

inherit native


S = "${WORKDIR}"

do_install () {
	install -d ${D}${datadir}/aclocal/
	cp ${WORKDIR}/*.m4 ${D}${datadir}/aclocal/
	install -d ${D}${datadir}/gettext/po/
	cp ${WORKDIR}/config.rpath ${D}${datadir}/gettext/
	cp ${WORKDIR}/Makefile.in.in ${D}${datadir}/gettext/po/
	cp ${WORKDIR}/remove-potcdate.sin ${D}${datadir}/gettext/po/
}
