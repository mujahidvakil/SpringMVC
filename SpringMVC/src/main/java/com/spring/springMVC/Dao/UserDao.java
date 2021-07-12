package com.spring.springMVC.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.springMVC.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemp;
	
	@Transactional
	public int createUser(User user) {
		int r=(Integer)this.hibernateTemp.save(user);
		return r;
		
	}
}
