package com.demo.entity.repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        try {

            SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();


            Book b = new Book("book name1 ", "Vimal 1 ");
            session.save(b);

            Person p = new Person("firstname1 ", "lastname 1 ", 21, "male 1 ");
            session.save(p);

            tx.commit();
            session.close();
            HibernateUtil.closeSessionFactory();

        } catch (Exception e) {
            System.out.println("e {}" + e.getMessage() + e);
        }
    }

    private static void save(Object t) {
        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(t);
        tx.commit();
        session.close();
        HibernateUtil.closeSessionFactory();
    }
}
