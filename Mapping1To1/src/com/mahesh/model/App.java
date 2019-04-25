package com.mahesh.model;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class).buildSessionFactory();
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		Laptop laptop1 = new Laptop("Dell", 190000);
		Laptop laptop2 = new Laptop("Hp Compaq", 220000);
		Laptop laptop3 = new Laptop("Samsung", 520000);
		Laptop laptop4 = new Laptop("Macbook Pro", 220000);

		Student student1 = new Student();
		student1.setRollNo(101);
		student1.setSname("John");
		student1.setLaptop(laptop1);

		Student student2 = new Student();
		student2.setRollNo(102);
		student2.setSname("Ron");
		student2.setLaptop(laptop2);

		Student student3 = new Student();
		student3.setRollNo(103);
		student3.setSname("Andrew");
		student3.setLaptop(laptop3);

		Student student4 = new Student();
		student4.setRollNo(104);
		student4.setSname("Mathew");
		student4.setLaptop(laptop4);

		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);

		session.save(laptop1);
		session.save(laptop2);
		session.save(laptop3);
		session.save(laptop4);

		session.getTransaction().commit();

		session.evict(student1);
		session.evict(student2);
		session.evict(student3);
		session.evict(student4);

		System.out.println("Inserted Successfully.");
	}
}
