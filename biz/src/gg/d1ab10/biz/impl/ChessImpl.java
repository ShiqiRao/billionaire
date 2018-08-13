package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Chess;
import gg.d1ab10.biz.Wealth;
import gg.d1ab10.biz.units.EstateUnit;

import java.util.HashSet;
import java.util.Set;

public class ChessImpl implements Chess {
    private Set<EstateUnit> estateUnits = new HashSet<>();
    private Money account;
    private int position;
    private ChessImpl next = this;

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void profit(Wealth wealth) {
        if (wealth instanceof Money) {
            account.setMoney(account.getMoney() + ((Money) wealth).getMoney());
        } else if (wealth instanceof EstateUnit) {
            estateUnits.add((EstateUnit) wealth);
        }
    }

    @Override
    public void loss(Wealth wealth) {
        if (wealth instanceof Money) {
            account.setMoney(account.getMoney() - ((Money) wealth).getMoney());
        } else if (wealth instanceof EstateUnit) {
            estateUnits.remove(wealth);
        }
    }

    @Override
    public void trade(Chess chess) {
        //todo
    }

    @Override
    public boolean isOwn(Wealth wealth) {
        if (wealth instanceof Money) {
            return ((Money) wealth).getMoney() > account.getMoney();
        } else if (wealth instanceof EstateUnit) {
            return estateUnits.contains(wealth);
        }
        return false;
    }

    @Override
    public void setNext(Chess next) {
        this.next = (ChessImpl) next;
    }

    @Override
    public Chess getNext() {
        return next;
    }

}
