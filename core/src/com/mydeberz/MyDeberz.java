package com.mydeberz;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class MyDeberz extends Game {

	public static final int w = 480, w1 = 360, w2 = 720, w3 = 960, w4 = 1440, w5 = 1920;
	public static final int h = 320, h1 = 240, h2 = 480, h3 = 640, h4 = 960, h5 = 1280;
	public static final int WIDTH = 480, HEIGHT = 320;
	public static final String TITLE = "Deberz";

	@Override
	public void create () {

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	@Override
	public void dispose () {

	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
