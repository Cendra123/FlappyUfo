package com.mygdx.game.State;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        mouse = new Vector3();
        cam = new OrthographicCamera();
    }

    protected abstract  void handelInput();
    public abstract void update(Float dt);
    public abstract void render (SpriteBatch sb);
}