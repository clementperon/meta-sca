SUMMARY = "the modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://gitlab.com/pycqa/flake8"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75b26781f1adf1aa310bda6098937878"

DEPENDS += "\
            ${PYTHON_PN}-entrypoints-native \
            ${PYTHON_PN}-importlib-metadata-native \
            ${PYTHON_PN}-mccabe-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-pyflakes-native \
            "

PYPI_PACKAGE = "flake8"

SRC_URI[md5sum] = "6ab0ad6630b6917fafabded7f80344b4"
SRC_URI[sha256sum] = "aadae8761ec651813c24be05c6f7b4680857ef6afaae4651a4eccaef97ce6c3b"

inherit pypi
inherit native
inherit setuptools3
