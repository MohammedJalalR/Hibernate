package com.jspiders.pkg;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Student_Info student = new Student_Info();
		student.setRollNo(1);
		student.setName("Jalal");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

}
