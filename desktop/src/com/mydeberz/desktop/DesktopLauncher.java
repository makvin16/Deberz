package com.mydeberz.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mydeberz.MyDeberz;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = MyDeberz.TITLE;
		config.width = MyDeberz.w;
		config.height = MyDeberz.h;
		new LwjglApplication(new MyDeberz(), config);
	}
}
