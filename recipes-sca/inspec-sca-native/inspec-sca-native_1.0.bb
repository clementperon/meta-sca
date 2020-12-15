SUMMARY = "SCA description for inspec"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://inspec.sca.description"

inherit native
inherit sca-description

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/inspec.sca.description ${D}${datadir}/
}

FILES_${PN} = "${datadir}"
