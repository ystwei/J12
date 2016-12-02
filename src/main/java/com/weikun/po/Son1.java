package com.weikun.po;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Son1 {
    private int sid;
    private String sname;
    private Father1 father;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Son1 son1 = (Son1) o;

        if (sid != son1.sid) return false;
        if (sname != null ? !sname.equals(son1.sname) : son1.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }

    public Father1 getFather() {
        return father;
    }

    public void setFather(Father1 father) {
        this.father = father;
    }
}
