package com.spring.springMVC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springMVC.Dao.UserDao;
import com.spring.springMVC.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	public int insertUser(User user) {
		int r =(Integer)this.userdao.createUser(user);
		return r;
	}

}
