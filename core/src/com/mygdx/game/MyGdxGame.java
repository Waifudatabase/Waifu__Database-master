package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import javafx.scene.control.Button;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture butt;
	/*int pz = 0;
	int px= 0;
	int py= 0;
	int spacex = 170;
	int spacey = 170;
	*/
	Stage stage;
	private TextButton textButton;




	/*public class MyInputProcessor implements InputProcessor {
		public boolean keyDown (int keycode) {
			switch (keycode){
				case(Input.Keys.UP):
					if(py ==  spacey){
						pz = pz+2;
					}
				case(Input.Keys.DOWN):
					if(py ==  (spacey*2)) {
						pz = pz - 2;
					}
				case(Input.Keys.RIGHT):
					if(px == spacex ){
						pz = pz+1;
					}
				case(Input.Keys.LEFT):
					if(px == (spacex*2 )){
						pz = pz-1;
					}

			}
			return true;
		}

		public boolean keyUp (int keycode) {


			return false;
		}

		public boolean keyTyped (char character) {
			return false;
		}

		public boolean touchDown (int x, int y, int pointer, int button) {
			return false;
		}

		public boolean touchUp (int x, int y, int pointer, int button) {
			return false;
		}

		public boolean touchDragged (int x, int y, int pointer) {
			return false;
		}

		public boolean mouseMoved (int x, int y) {
			return false;
		}

		public boolean scrolled (int amount) {
			return false;
		}
	}
*/
	@Override
	public void create () {
		stage = new Stage();
		batch = new SpriteBatch();
		img = new Texture("roof.png");
		//lolit = new Texture("loli.png");
		//butt = new Texture("butt.png");

		//goosetext = new Texture("goosetext.png");
		//MyInputProcessor inputProcessor = new MyInputProcessor();

		Gdx.input.setInputProcessor(stage);
		Skin skin = new Skin(Gdx.files.internal("neon/skin/neon-ui.json"));
		textButton = new TextButton("Silly Goose", skin, "default");
		textButton.setPosition(120,400);
		stage.addActor(textButton);


		snakeButton = new TextButton("", skin, "default");
		textButton.setPosition(120,400);
		stage.addActor(textButton);

	}

	@Override
	public void render () {

	/*	if (pz == 0) {
			px = spacex;
			py = spacey;
		}
		else if(pz == 1) {
			px = spacex*2;
			py = spacey;
		}
		else if(pz == 2){
			px = spacex;
			py = spacey*2;
		}
		else if(pz == 3) {
			px = spacex*2;
			py = spacey*2;
		}
*/



			Gdx.gl.glClearColor(1, 0, 0, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			batch.begin();
			batch.draw(img, 0, 0);


		    batch.end();
			stage.draw();



	}



	@Override
	public void dispose () {

	}

}
