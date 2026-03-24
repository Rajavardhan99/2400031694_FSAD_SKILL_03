package com.klu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.entity.Product;
import com.klu.util.HibernateUtil;

public class InsertMoreProducts {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(new Product("Laptop", "Electronics", 60000, 10));
        session.persist(new Product("Headphones", "Electronics", 2500, 40));
        session.persist(new Product("Smartphone", "Electronics", 30000, 25));
        session.persist(new Product("Sofa", "Furniture", 20000, 8));
        session.persist(new Product("Bed", "Furniture", 18000, 12));
        session.persist(new Product("Pencil", "Stationery", 10, 200));
        session.persist(new Product("Eraser", "Stationery", 5, 150));
        tx.commit();
        session.close();

        System.out.println("Additional products inserted successfully");
    }
}
