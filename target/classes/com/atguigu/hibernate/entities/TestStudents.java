package com.atguigu.hibernate.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by huan on 2015/5/19.
 */
public class TestStudents {

    private  SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public static  void main(String[] agrs)
    {
        Configuration configuration = new Configuration();

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        //增加学生

   /*     Students students = new Students();
        students.setId(1);
        students.setName("张三");
        students.setPwd("123");
        students.setDate(new Date());

        session.save(students);
        */
        Students students1 = new Students();
        students1.setId(4);
        students1.setName("小兰");
        students1.setPwd("456");
        students1.setDate(new Date());
        session.save(students1);

        System.out.println(students1);

        //修改学生

       /* Students students = (Students) session.get(Students.class,1);
        students.setName("张三丰");
        System.out.println(students);*/

        //查询学生

       /* Students students = (Students) session.get(Students.class,1);
        System.out.println(students);*/

        //删除学生

        /*Students students = (Students) session.get(Students.class,2);
        session.delete(students);*/


        transaction.commit();
        session.close();


    }



}
