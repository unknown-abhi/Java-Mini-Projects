package com.Abhi.demoHib;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Abhi.pojo.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

//		Laptop lap = new Laptop();
//		lap.setlId(101);
//		lap.setlName("HP");

		Student stud = new Student();
		stud.setMarks(83);
		stud.setName("Janvi");

		Student stud0 = new Student();
		stud0.setMarks(85);
		stud0.setName("Janvii");
//		stud.setRollNo(11);
//		stud.setLaptop(lap); - OneToOne
//		stud.getLaptop().add(lap); // - ManyToOne;

//		lap.setStudent(stud); // ManyToOne and OneToMany mappedBy

//		lap.getStudent().add(stud);

		// Save
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tX = session.beginTransaction();
		session.save(stud);
		session.save(stud0);
		tX.commit();

		// Fetch HQL
		Query<Student> q1 = session.createQuery("FROM Student WHERE name = :name", Student.class);
		q1.setParameter("name", "Janvi");

		Student stud1 = q1.uniqueResult();
		System.out.println(stud1);

		// Fetch HQL
		TypedQuery<Student> q01 = session.createQuery("SELECT marks FROM Student WHERE name = :name", Student.class);
		q01.setParameter("name", "Janvi");

		Object stud01 = (Object) q01.getSingleResult();
		System.out.println(stud01);

		// Fetch HQL
		Query<Student> q11 = session.createQuery("FROM Student", Student.class);
		List<Student> stud11 = q11.list();
		for (Student s : stud11) {
			System.out.println(s);
		}

		// Fetch Native Query
		Query<Student> q2 = session.createNativeQuery("Select * FROM Student WHERE name = :name", Student.class);
		q2.setParameter("name", "Janvi");

		Student stud2 = q2.uniqueResult();
		System.out.println(stud2);

		// Fetch Native Query
		Query<Student> q22 = session.createNativeQuery("Select * FROM Student", Student.class);

		List<Student> stud22 = q22.list();
		for (Student s : stud22) {
			System.out.println(s);
		}
		session.close();
	}

}
