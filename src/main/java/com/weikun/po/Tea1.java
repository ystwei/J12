package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Tea1 {
    private int tid;
    private String tname;
    private Set<Stu1> stu=new HashSet<Stu1>();

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tea1 tea1 = (Tea1) o;

        if (tid != tea1.tid) return false;
        if (tname != null ? !tname.equals(tea1.tname) : tea1.tname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + (tname != null ? tname.hashCode() : 0);
        return result;
    }

    public Set<Stu1> getStu() {
        return stu;
    }

    public void setStu(Set<Stu1> stu) {
        this.stu = stu;
    }
}
