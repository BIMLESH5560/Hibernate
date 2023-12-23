package com.pdskills.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hebernateconfi {
	public Session getsession() {
		 Configuration config= new  Configuration().configure().addAnnotatedClass( Student.class);
	        SessionFactory sf= config.buildSessionFactory();
	         Session session=sf.openSession();
	       
	         
	}

}
