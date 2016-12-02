package com.weikun.po;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Teastu1 {
    private int tid;
    private int sid;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teastu1 teastu1 = (Teastu1) o;

        if (tid != teastu1.tid) return false;
        if (sid != teastu1.sid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + sid;
        return result;
    }
}
