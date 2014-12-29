package com.RosalilaStudio.LittlerIves;

import com.RosalilaStudio.LittlerIves.Screens.AbstractScreen;
import com.RosalilaStudio.LittlerIves.Screens.InfoScreen;
import com.RosalilaStudio.LittlerIves.Screens.MenuScreen;
import com.RosalilaStudio.LittlerIves.Screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class LittlerIvis extends Game {

	public static AbstractScreen MAIN, PLAY, INFO;
	public static AssetManager MANAGER;
	private int width, height;
	private Viewport view;
	private SpriteBatch sb;

	public LittlerIvis() {
		MAIN = new MenuScreen(this);
		PLAY = new PlayScreen(this);
		INFO = new InfoScreen(this);
	}

	@Override
	public void create() {
		width = 512;
		height = 275;
		view = new ScalingViewport(Scaling.stretch, width, height);
		sb = new SpriteBatch();
		MANAGER = new AssetManager();
		loadAssets();
		
		while(!MANAGER.update()){
			
		}
		
		setScreen(MAIN);
	}

	private void loadAssets() {
		//Intros de Informacion
		MANAGER.load(Paths.I.getPath("intro1.png"),Texture.class);
		MANAGER.load(Paths.I.getPath("intro2.png"),Texture.class);
		MANAGER.load(Paths.I.getPath("intro3.png"),Texture.class);
		MANAGER.load(Paths.I.getPath("intro4.png"),Texture.class);
		MANAGER.load(Paths.I.getPath("intro5a.png"),Texture.class);
		MANAGER.load(Paths.I.getPath("intro5b.png"),Texture.class);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Viewport getView() {
		return view;
	}

	public SpriteBatch getSb() {
		return sb;
	}
}
