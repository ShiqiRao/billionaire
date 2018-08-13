package gg.d1ab10.biz;

public interface Chess {
    int getPosition();//获取位置

    void move(int step);//移动棋子

    void profit(Wealth wealth);//盈

    void loss(Wealth wealth);//亏

    void trade(Chess chess);//发起交易

    boolean isOwn(Wealth wealth);//是否拥有
}
