require m4.inc

LICENSE = "GPLv3"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504\
	            file://examples/COPYING;md5=fbc986d45b3dae6725c29870dd6b669d"

PR = "r4"
SRC_URI += "file://ac_config_links.patch"

SRC_URI[md5sum] = "a5dfb4f2b7370e9d34293d23fd09b280"
SRC_URI[sha256sum] = "e9176a35bb13a1b08482359aa554ee8072794f58f00e4827bf0e06b570c827da"

SRC_URI += "http://sources.gentoo.org/cgi-bin/viewvc.cgi/gentoo-x86/sys-devel/m4/files/m4-1.4.16-no-gets.patch;name=p"

SRC_URI[p.md5sum] = "6533ca02d3dbe01f0e96606f7fced4bf"
SRC_URI[p.sha256sum] = "6059410a6ed64f68a07aa28cc65bc1c7ee6c6528f2750f1c5ba966d82eb521b3"
