package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Chess;
import gg.d1ab10.biz.Dice;
import gg.d1ab10.biz.Scene;

public class Round implements Runnable {
    private final Chess[] chesses;
    private final Dice dice;
    private final Scene scene;


    public Round(Chess[] chesses, Dice dice, Scene scene) {
        this.chesses = chesses;
        this.dice = dice;
        this.scene = scene;
        for (int i = 0; i < chesses.length - 1; i++) {
            chesses[i].setNext(chesses[i + 1]);
        }
        chesses[chesses.length - 1].setNext(chesses[0]);
    }


    @Override
    public void run() {
        Chess chess = chesses[0];
        while (true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
