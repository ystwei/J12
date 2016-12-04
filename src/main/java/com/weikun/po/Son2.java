package com.weikun.po;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/12/4.
 */
@Entity
public class Son2 {
    private int sid;
    private String sname;
    private Father2 father;

    @Id
    @Column(name = "sid", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname", nullable = true, length = 10)
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

        Son2 son2 = (Son2) o;

        if (sid != son2.sid) return false;
        if (sname != null ? !sname.equals(son2.sname) : son2.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fid", referencedColumnName = "fid")
    public Father2 getFather() {
        return father;
    }

    public void setFather(Father2 father) {
        this.father = father;
    }
}
