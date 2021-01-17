package com.argentumcore.client

import org.koin.core.context.startKoin
import org.koin.dsl.module

object Modules {

    private val mainModule = module {
        single<IMidiPlayer> { DefaultMidiPlayer() }
    }

    fun init(gameOptions: GameOptions) {

        val moduleList = arrayListOf(mainModule)

        // Add the platform-specific Midi Player if exists
        if (gameOptions.midiPlayer != null) {
            moduleList.add(module {
                single { gameOptions.midiPlayer }
            })
        }

        var koinApplication = startKoin {
            modules(moduleList)
        }

        koinApplication.modules()
    }

}
