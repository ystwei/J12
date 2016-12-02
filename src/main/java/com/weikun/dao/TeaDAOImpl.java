package com.weikun.dao;

import com.weikun.po.Hus1;
import com.weikun.po.Stu1;
import com.weikun.po.Tea1;
import com.weikun.po.Wife1;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/2.
 */
public class TeaDAOImpl {
    private Configuration cfg;
    private SessionFactory sf;
    private Session session;
    private Transaction trans;
    public TeaDAOImpl(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();
    }
    @Test
    public void del(){
        try {
            session=sf.openSession();
            trans=session.beginTransaction();
            Tea1 h=(Tea1)session.load(Tea1.class,1);

            session.delete(h);
            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }

    @Test
    public void add(){
        try {
            session=sf.openSession();
            trans=session.beginTransaction();
            Tea1 t1=new Tea1();
            t1.setTid(1);
            t1.setTname("ROSE");



            Tea1 t2=new Tea1();
            t2.setTid(2);
            t2.setTname("ALCIE");


            Stu1 s1=new Stu1();
            s1.setSid(1);
            s1.setSname("JACK");
            s1.getTea().add(t1);
            s1.getTea().add(t2);

            Stu1 s2=new Stu1();
            s2.setSid(2);
            s2.setSname("MIKE");

            s2.getTea().add(t1);
            s2.getTea().add(t2);


            t1.getStu().add(s1);
            t1.getStu().add(s2);


            t2.getStu().add(s1);
            t2.getStu().add(s2);


            session.save(t1);
            session.save(t2);
            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }
}
