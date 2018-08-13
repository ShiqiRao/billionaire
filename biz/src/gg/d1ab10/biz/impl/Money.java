package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Wealth;

public class Money implements Wealth {
    private int money;//金额

    public Money(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
