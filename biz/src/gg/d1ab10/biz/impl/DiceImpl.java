package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Dice;

import java.util.HashMap;
import java.util.Map;

public class DiceImpl implements Dice {

    private final int diceCount;
    private final int maxPoint;

    public DiceImpl(int diceCount, int maxPoint) {
        this.diceCount = diceCount;
        this.maxPoint = maxPoint;
    }

    @Override
    public Map<String, Integer> dice() {
        int sum = 0;
        Map<String, Integer> state = new HashMap<>();
        for (int i = 1; i <= diceCount; i++) {
            int point = (int) (1 + Math.random() * (maxPoint));
            sum += point;
            state.put("Dice" + i, point);
        }
        state.put("Sum", sum);
        return state;
    }
}
