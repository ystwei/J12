package com.weikun.dao;

import com.weikun.po.Father1;
import com.weikun.po.Son1;
import com.weikun.po.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.sql.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/2.
 */
public class FatherDAOImpl {
    private Configuration cfg;
    private SessionFactory sf;
    private Session session;
    private Transaction trans;
    public FatherDAOImpl(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();

    }

    @Test
    public void query(){

        try {
            session=sf.openSession();


            Father1 f=(Father1)session.load(Father1.class,1);

            System.out.print(f.getFname());


            Set<Son1> s=f.getSons();
            Iterator<Son1> it=s.iterator();
            while(it.hasNext()){
                System.out.print(it.next().getSname());
            }
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
            Father1 f=new Father1();
            f.setFid(1);
            f.setFname("MIKE");


            Son1 s=new Son1();
            s.setSid(1);
            s.setSname("ROSE");
            s.setFather(f);

            Son1 s1=new Son1();
            s1.setSid(2);
            s1.setSname("ALICE");
            s1.setFather(f);

            f.getSons().add(s);
            f.getSons().add(s1);


            session.save(f);

            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }
}
