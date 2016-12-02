package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Stu1 {
    private int sid;
    private String sname;
    private Set<Tea1> tea=new HashSet<Tea1>();

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

        Stu1 stu1 = (Stu1) o;

        if (sid != stu1.sid) return false;
        if (sname != null ? !sname.equals(stu1.sname) : stu1.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }

    public Set<Tea1> getTea() {
        return tea;
    }

    public void setTea(Set<Tea1> tea) {
        this.tea = tea;
    }
}
