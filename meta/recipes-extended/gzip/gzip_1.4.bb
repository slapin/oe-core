require gzip.inc

PR = "r1"

BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "e381b8506210c794278f5527cba0e765"
SRC_URI[sha256sum] = "d166cfd3da380da1bd535633e8890bfb5664f9e68870a611d1dc01a3e9f711ee"

SRC_URI += "http://sources.gentoo.org/cgi-bin/viewvc.cgi/gentoo-x86/sys-devel/m4/files/m4-1.4.16-no-gets.patch;name=p"

SRC_URI[p.md5sum] = "6533ca02d3dbe01f0e96606f7fced4bf"
SRC_URI[p.sha256sum] = "6059410a6ed64f68a07aa28cc65bc1c7ee6c6528f2750f1c5ba966d82eb521b3"
