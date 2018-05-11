package com.application.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.application.dao.PersonDAO;
import com.application.model.Person;

@Service
public class ServImpl implements Serv {

	@Autowired
	private PersonDAO pd;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void saveStudent() {
		
		Person p=new Person();
		p.setCountry("IND");
		p.setName("Ramesh");
		pd.save(p);
		
		
	}

}
