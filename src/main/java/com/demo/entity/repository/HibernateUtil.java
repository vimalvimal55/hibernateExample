package com.demo.entity.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


    private static SessionFactory sessionFactory = null;

    public static SessionFactory createSessionFactory() {
        if (sessionFactory == null) {
            Configuration conf = new Configuration();
            sessionFactory = conf.configure().buildSessionFactory();
        }
        return sessionFactory;


    }

    public static void closeSessionFactory() {
        sessionFactory.close();
    }
}
