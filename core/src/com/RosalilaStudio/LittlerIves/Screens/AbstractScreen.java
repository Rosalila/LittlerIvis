package com.RosalilaStudio.LittlerIves.Screens;

import com.RosalilaStudio.LittlerIves.LittlerIvis;
import com.badlogic.gdx.Screen;

public abstract class AbstractScreen implements Screen {
	
	protected LittlerIvis game;

	public AbstractScreen(LittlerIvis game) {
		this.game=game;
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
