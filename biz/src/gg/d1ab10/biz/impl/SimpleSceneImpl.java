package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Chess;
import gg.d1ab10.biz.Scene;
import gg.d1ab10.biz.Unit;

public class SimpleSceneImpl implements Scene {
    private final Unit[] units;

    public SimpleSceneImpl(Unit[] units) {
        this.units = units;
    }

    @Override
    public int increasePosition(Chess chess, int step) {
        int result = chess.getPosition() + step;
        if (result > units.length) {
            //bonus
            return result - units.length;
        }
        return result;
    }
}
