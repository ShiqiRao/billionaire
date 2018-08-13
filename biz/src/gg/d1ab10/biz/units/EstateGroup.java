package gg.d1ab10.biz.units;

public enum EstateGroup {
    AS(0, "亚洲"),
    NA(1, "北美"),
    SA(2, "南美"),
    OA(3, "大洋洲"),
    AF(4, "非洲"),
    EU(5, "欧洲"),
    STATION(6, "车站");

    int value;
    String description;

    EstateGroup(int value, String description) {
        this.value = value;
        this.description = description;
    }
}
