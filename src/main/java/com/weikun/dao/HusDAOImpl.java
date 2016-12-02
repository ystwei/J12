package com.weikun.dao;

import com.weikun.po.Hus1;
import com.weikun.po.User;
import com.weikun.po.Wife1;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.sql.Date;

/**
 * Created by Administrator on 2016/12/2.
 */
public class HusDAOImpl {
    private Configuration cfg;
    private SessionFactory sf;
    private Session session;
    private Transaction trans;
    public HusDAOImpl(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();
    }

    @Test
    public void query(){
        try {
            session=sf.openSession();


            Hus1 h=(Hus1)session.load(Hus1.class,5);

            System.out.println(h.getHname()+"---"+h.getWife().getWname());


        } catch (HibernateException e) {

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
            Hus1 h=new Hus1();
            h.setId(5);
            h.setHname("JOE");
            Wife1 w=new Wife1();
            w.setWname("JANE");
            h.setWife(w);
            w.setHus(h);
            w.setId(5);

            session.save(h);
            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }

    @Test
    public void del(){
        try {
            session=sf.openSession();
            trans=session.beginTransaction();
            Hus1 h=(Hus1)session.load(Hus1.class,5);

            session.delete(h);
            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }
}
