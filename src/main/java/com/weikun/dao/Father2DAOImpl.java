package com.weikun.dao;

import com.weikun.po.Father1;
import com.weikun.po.Father2;
import com.weikun.po.Son1;
import com.weikun.po.Son2;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/4.
 */
public class Father2DAOImpl {

    private Configuration cfg;
    private SessionFactory sf;
    private Session session;
    private Transaction trans;
    public Father2DAOImpl(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();

    }

    @Test
    public void queryAll(){
        try {
            session=sf.openSession();

            Query q=session.createQuery("from Father2 as f");
            q.setCacheable(true);
            List<Father2> list=q.list();
            Iterator<Father2> it=list.iterator();

            while(it.hasNext()){
                Father2 f=it.next();
                System.out.print(f.getFname());
                Set<Son2> sons=f.getSon();
                Iterator <Son2> it1=sons.iterator();
                while(it1.hasNext()){
                    Son2 s=it1.next();
                    System.out.print(s.getSname());
                }
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
            Father2 f=new Father2();
            f.setFid(1);
            f.setFname("MIKE");


            Son2 s=new Son2();
            s.setSid(1);
            s.setSname("ROSE");
            s.setFather(f);

            Son2 s1=new Son2();
            s1.setSid(2);
            s1.setSname("ALICE");
            s1.setFather(f);

            f.getSon().add(s);
            f.getSon().add(s1);


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
