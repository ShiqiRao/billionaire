package gg.d1ab10.biz.units;

import gg.d1ab10.biz.Unit;

public abstract class AbstractUnit implements Unit {
    protected final String name;//名称



    public AbstractUnit(String name) {
        this.name = name;
    }
}
