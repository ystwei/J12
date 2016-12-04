package com.weikun.ioc;

/**
 * Created by Administrator on 2016/12/4.
 */
public class MyKecheng implements Trad {
    private Teacher tea;

    public void setTea(Teacher tea) {
        this.tea = tea;
    }

    public Teacher getTea() {
        return tea;
    }

    @Override
    public void txt() {
        this.tea.jiangke();
    }
}
