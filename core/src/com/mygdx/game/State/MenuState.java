package com.mygdx.game.State;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyMain;

public class MenuState extends State {
    private Texture background;
    private Texture playButton;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playButton = new Texture("playbtn.png");
    }

    @Override
    public void handelInput() {

    }

    @Override
    public void update(Float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, FlappyMain.WIDTH, FlappyMain.HEIGH);
        sb.draw(playButton, (FlappyMain.WIDTH/2)-(playButton.getWidth()/2), FlappyMain.HEIGH/2 );
        sb.end();

    }
}
