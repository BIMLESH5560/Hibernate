package com.pdskills.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
//         Student stud =new Student();
//         System.out.println(stud);
//        stud.setRollno(99);
//      stud.setName("janu");
//       stud.setMarks(100);
		
		Student stud =null;
		Student stud1=null;
		
       Configuration config= new  Configuration().configure().addAnnotatedClass( Student.class);
       SessionFactory sf= config.buildSessionFactory();
       Session session=sf.openSession();
      // Transaction tx=session.beginTransaction();
       // session.save(stud);
        stud=session.get(Student.class, 101);
       stud1=session.get(Student.class, 99);
       
        //tx.commit();
       System.out.println(stud1);
      System.out.println(stud);
     // System.out.println(stud1);
      session.clear();
      Session session1=sf.openSession();
      session.close();
      
      
      
         
         
         
    }
}
