package com.soni.HibernateMySQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Student stud = new Student();
//        stud.setRollNo(101);
//        stud.setName("Aman");
//        stud.setMarks(70);
    	
    	Student stud = null;
    	Student stud1 = null;
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = config.buildSessionFactory(); 
        Session session = sf.openSession();
        
        //Transaction are used when i perform update and insert query on table...
//        org.hibernate.Transaction tx = session.beginTransaction();
        
//        session.save(stud);
//        tx.commit();
        
        //Level 1 Caching
        //Called Eager
//        stud = session.get(Student.class, 101);
//        stud1 = session.get(Student.class, 101);
        
//        stud = session.load(Student.class, 101);
        
//        System.out.println(stud);
//        System.out.println(stud1);
//        
//        session.close();
        
        
        
        stud = session.get(Student.class, 101);
        System.out.println(stud);
        
        session.close();
        
        Session session1 = sf.openSession();
        stud1 = session1.get(Student.class, 101);
        System.out.println(stud1);
        
        session1.close();
    }
}
