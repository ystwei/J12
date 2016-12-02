package com.weikun.po;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Wife1 {
    private int id;
    private String wname;
    private Hus1 hus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wife1 wife1 = (Wife1) o;

        if (id != wife1.id) return false;
        if (wname != null ? !wname.equals(wife1.wname) : wife1.wname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        return result;
    }

    public Hus1 getHus() {
        return hus;
    }

    public void setHus(Hus1 hus) {
        this.hus = hus;
    }
}
