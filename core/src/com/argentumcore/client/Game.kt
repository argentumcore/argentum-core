package com.argentumcore.client

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import ktx.app.KtxGame

class Game(private val options: GameOptions) : KtxGame<Screen>() {

    override fun create() {
        Gdx.graphics.setTitle("Argentum Core")

        Modules.init(options)

    }

    override fun render() {
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    }
}
