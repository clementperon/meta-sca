SUMMARY = "Check for python builtins being used as variables or parameters"
HOMEPAGE = "https://github.com/gforcada/flake8-builtins"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-pyflakes-native \
            "

PYPI_PACKAGE = "flake8-builtins"

SRC_URI[md5sum] = "6c727c5886c4e8b3c92291b0d977d89d"
SRC_URI[sha256sum] = "09998853b2405e98e61d2ff3027c47033adbdc17f9fe44ca58443d876eb00f3b"

inherit pypi
inherit native
inherit setuptools3
