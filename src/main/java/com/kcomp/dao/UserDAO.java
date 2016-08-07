package com.kcomp.dao;

import com.kcomp.model.User;

public interface UserDAO extends GenericDAO<User, Long>{
	
	boolean checkAvailable(String name);
	
	User findUserByName(String name);

}
