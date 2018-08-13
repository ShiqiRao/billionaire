package gg.d1ab10.biz.impl;

import gg.d1ab10.biz.Chess;
import gg.d1ab10.biz.Wealth;

public class Trade {

    public boolean trade(Chess payer, Chess gather, Wealth wealth) {
        if (payer.isOwn(wealth)) {
            payer.loss(wealth);
            gather.profit(wealth);
            return true;
        } else
            return false;
    }
}
