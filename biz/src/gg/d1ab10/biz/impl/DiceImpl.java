package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Dice;

import java.util.HashMap;
import java.util.Map;

public class DiceImpl implements Dice {

    @Override
    public Map<String, Integer> dice() {
        int firstDice = (int) (1 + Math.random() * (6));
        int secondDice = (int) (1 + Math.random() * (6));
        Map<String, Integer> state = new HashMap<>();
        state.put("firstDice", firstDice);
        state.put("secondDice", secondDice);
        state.put("sum", firstDice + secondDice);
        return state;
    }
}
