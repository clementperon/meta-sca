SUMMARY = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "${PYTHON_PN}-flake8-native"

SRC_URI_append = " file://flake8.sca.description"

inherit native
inherit sca-description
inherit python3-dir

PACKAGECONFIG ??= "\
                   2020 \
                   comprehensions \
                   dlint \
                   eradicate \
                   executable \
                   expression-complexity \
                   fixme \
                   functions \
                   import-order \
                   mutable \
                   quotes \
                   requirements \
                   strict \
                   string-format \
                   variables-names \
                   wemake-python \
                  "
PACKAGECONFIG[2020] = ",,${PYTHON_PN}-flake8-2020-native"
PACKAGECONFIG[comprehensions] = ",,${PYTHON_PN}-flake8-comprehensions-native"
PACKAGECONFIG[dlint] = ",,${PYTHON_PN}-flake8-dlint-native"
PACKAGECONFIG[eradicate] = ",,${PYTHON_PN}-flake8-eradicate-native"
PACKAGECONFIG[executable] = ",,${PYTHON_PN}-flake8-executable-native"
PACKAGECONFIG[expression-complexity] = ",,${PYTHON_PN}-flake8-expression-complexity-native"
PACKAGECONFIG[fixme] = ",,${PYTHON_PN}-flake8-fixme-native"
PACKAGECONFIG[functions] = ",,${PYTHON_PN}-flake8-functions-native"
PACKAGECONFIG[import-order] = ",,${PYTHON_PN}-flake8-import-order-native"
PACKAGECONFIG[mutable] = ",,${PYTHON_PN}-flake8-mutable-native"
PACKAGECONFIG[quotes] = ",,${PYTHON_PN}-flake8-quotes-native"
PACKAGECONFIG[requirements] = ",,${PYTHON_PN}-flake8-requirements-native"
PACKAGECONFIG[strict] = ",,${PYTHON_PN}-flake8-strict-native"
PACKAGECONFIG[string-format] = ",,${PYTHON_PN}-flake8-string-format-native"
PACKAGECONFIG[variables-names] = ",,${PYTHON_PN}-flake8-variables-names-native"
PACKAGECONFIG[wemake-python] = ",,${PYTHON_PN}-wemake-python-styleguide-native"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flake8.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"