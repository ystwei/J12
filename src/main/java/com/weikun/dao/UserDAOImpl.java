package com.weikun.dao;

import com.weikun.po.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.sql.Date;
import java.util.List;


/**
 * Created by Administrator on 2016/12/2.
 */
public class UserDAOImpl {
    private Configuration cfg;
    private SessionFactory sf;
    private Session session;
    private Transaction trans;
    public UserDAOImpl(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();

    }

    @Test
    public void add(){
        try {
            session=sf.openSession();

            trans=session.beginTransaction();
            User user=new User();

            user.setUsername("1202");
            user.setPassword("999");
            user.setAge(10);
            user.setBirth(new Date(System.currentTimeMillis()));

            session.save(user);

            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }
    @Test
    public void selectAll(){

        try {
            session=sf.openSession();


            Query q=session.createQuery("from User as u ");//HQL：hibernate Query language

            List<User> list=q.list();

            for(User u :list){
               System.out.println(u.getUsername()+"---"+u.getPassword());
            }



        } catch (HibernateException e) {

            e.printStackTrace();
        } finally {

            session.close();
        }

    }
    @Test
    public void update(){
        try {
            session=sf.openSession();

            trans=session.beginTransaction();

            User user=(User)session.load(User.class,1388);
            user.setUsername("哈尔滨");

            session.update(user);

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

            User user=(User)session.load(User.class,1390);
            session.delete(user);

            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {

            session.close();
        }
    }
    @Test
    public void add1(){
        try {
            session=sf.openSession();

            trans=session.beginTransaction();
            User user=new User();
            user.setId(1390);
            user.setUsername("我爱你么");
            user.setPassword("888");
            user.setAge(10);
            user.setBirth(new Date(System.currentTimeMillis()));

            session.saveOrUpdate(user);

            trans.commit();

        } catch (HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
}
