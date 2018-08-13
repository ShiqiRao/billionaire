package gg.d1ab10.biz.units;

import gg.d1ab10.biz.Chess;
import gg.d1ab10.biz.impl.Money;

public abstract class EstateUnit extends AbstractUnit {

    protected final int price;//初始售价
    protected int tolls;//过路费
    protected Chess owner;

    public EstateUnit(String name, int price, int tolls) {
        super(name);
        this.price = price;
        this.tolls = tolls;
    }

    public void passBy(Chess chess) {
        if (owner != null) {//若该地已被出售
            if (!chess.equals(owner)) {//若该地被他人所有
                Money tollsMoney = new Money(tolls);
                chess.loss(tollsMoney);
                owner.profit(tollsMoney);
            }
        } else {//若该地未出售

        }
    }

}
