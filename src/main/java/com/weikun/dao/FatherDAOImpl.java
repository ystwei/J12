package com.weikun.dao;

import com.weikun.po.Father1;
import com.weikun.po.MyReport;
import com.weikun.po.Son1;
import com.weikun.po.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
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
    public void test2(){


        try {
            session=sf.openSession();

            Query q=session.createQuery(" from Father1 as f where f.fid=:p1");
            q.setInteger("p1",1);
            q.setMaxResults(1);
            Father1 f=(Father1)q.uniqueResult();
            System.out.println(f.getFname());


        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Test
    public void test3(){


        try {
            session=sf.openSession();

            Query q=session.createQuery("select " +
                    "new com.weikun.po.MyReport(f.fid,f.fname) from Father1 as f");
            q.setLockMode("f",LockMode.UPGRADE_NOWAIT);
            List<MyReport> list=q.list();

            for(MyReport myReport :list){
                System.out.println(myReport.getFname());
            }


        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Test
    public void test1(){

        List list=query2();
        Iterator it=list.iterator();
        Object[] os=null;
        while(it.hasNext()){
            os=(Object[])it.next();
            System.out.println(os[0]+"--"+os[1]);
        }

    }
    public List query2(){

        List list=null;
        try {
            session=sf.openSession();

            Query q=session.createQuery("select fname,fid from Father1 as f");
            list=q.list();


        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    @Test
    public void test(){
        Set<Son1> s= query1();
        Iterator<Son1> it=s.iterator();
        while(it.hasNext()){
            System.out.print(it.next().getSname());
        }
    }
    public Set<Son1> query1(){
        Father1 f=null;
        try {
            session=sf.openSession();
            f=(Father1)session.load(Father1.class,1);
            if(!Hibernate.isInitialized(f.getSons())){
                Hibernate.initialize(f.getSons());
            }
            System.out.print(f.getFname());
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return f.getSons();
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
