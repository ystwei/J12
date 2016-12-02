package com.weikun.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Teastu1PK implements Serializable {
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

        Teastu1PK teastu1PK = (Teastu1PK) o;

        if (tid != teastu1PK.tid) return false;
        if (sid != teastu1PK.sid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + sid;
        return result;
    }
}
