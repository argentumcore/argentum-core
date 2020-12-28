package com.argentumcore.client.desktop;

import com.argentumcore.client.GameOptions;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.argentumcore.client.Game;

/** Launches the desktop (LWJGL3) application. */
public class DesktopLauncher {
	public static void main(String[] args) {
		createApplication();
	}

	private static Lwjgl3Application createApplication() {
		GameOptions options = new GameOptions(null);
		return new Lwjgl3Application(new Game(options), getDefaultConfiguration());
	}

	private static Lwjgl3ApplicationConfiguration getDefaultConfiguration() {
		Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
		configuration.setTitle("Argentum Core");
		configuration.setWindowedMode(1024, 768);
		configuration.setWindowIcon("icons/icon128.png", "icons/icon64.png", "icons/icon32.png", "icons/icon16.png");
		return configuration;
	}
}