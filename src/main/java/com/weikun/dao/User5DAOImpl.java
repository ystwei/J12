package com.weikun.dao;

import com.weikun.po.User;
import com.weikun.po.User5;
import com.weikun.po.User5PK;
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
public class User5DAOImpl {
    public static void main(String[] args) {

    }
    private Configuration cfg;
    private SessionFactory sf;
    private Session session;
    private Transaction trans;
    public User5DAOImpl(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();

    }
    @Test
    public void del(){
        try {
            session=sf.openSession();

            trans=session.beginTransaction();

            User5PK pk=new User5PK();
            pk.setUsername("JSON");
            pk.setSex("M");
            User5 u5=session.load(User5.class,pk);
            session.delete(u5);

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
            User5 user=new User5();
            User5PK pk=new User5PK();
            pk.setUsername("LALALA");
            pk.setSex("F");
            user.setPk(pk);
            user.setAge(100);
            session.save(user);

            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }

}
