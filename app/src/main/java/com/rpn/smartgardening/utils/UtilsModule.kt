package com.rpn.smartgardening.utils

import org.koin.dsl.module

val utilsModule = module {
    factory { SettingsUtility(get()) }
}