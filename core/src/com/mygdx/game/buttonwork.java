package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by seanryan on 1/24/17.
 */
public class buttonwork extends MyGdxGame{
        private Stage stage;
        private TextButton textButton;

    @Override
    public void create() {
        Skin skin = new Skin(Gdx.files.internal("neon/skin/neon-ui.json"));
        textButton = new TextButton("Silly Goose", skin, "default");
        textButton.setPosition(15,40);
        stage.addActor(textButton);
    }

    @Override
    public void render() {
        super.render();
        stage.draw();
    }
}




