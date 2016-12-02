package com.weikun.po;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Hus1 {
    private int id;
    private String hname;
    private Wife1 wife;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hus1 hus1 = (Hus1) o;

        if (id != hus1.id) return false;
        if (hname != null ? !hname.equals(hus1.hname) : hus1.hname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (hname != null ? hname.hashCode() : 0);
        return result;
    }

    public Wife1 getWife() {
        return wife;
    }

    public void setWife(Wife1 wife) {
        this.wife = wife;
    }
}
