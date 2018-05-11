package com.application.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.application.model.Person;

@Repository
public class PersonDAOImpl extends BaseDaoImpl implements PersonDAO {
    
	public void save(Person p) {
		Session s=currentSession();
		s.persist(p);
		
	}

	

}