package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.FlappyMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyMain.WIDTH;
		config.height = FlappyMain.HEIGH;
		config.title = FlappyMain.TITLE;
		new LwjglApplication(new FlappyMain(), config);
	}
}
