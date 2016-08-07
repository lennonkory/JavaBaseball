package com.kcomp.dao;

import com.kcomp.model.User;

import javax.persistence.NoResultException;
import javax.persistence.Query;


public class UserJPADAO extends GenericJPADAO<User, Long> implements UserDAO{

	public UserJPADAO() {
		super(User.class);
	}

	private Query createQuery(String hql){
		return this.getEntityManager().createQuery(hql);
	}
	
	private String getClassName(){
		return this.getPersistentClass().getSimpleName();
	}
	
	public boolean checkAvailable(String name) {
		String hql = "select count(*) from " + getClassName() + " u where u.name = :name ";
		Query q = createQuery(hql);
		q.setParameter("name", name);
		
		long count = (Long) q.getSingleResult();
		
		return count < 1;
	}

	public User findUserByName(String name) {
		
		User user = null;
		
		String hql = "select u from " + this.getClassName() + " u where u.name = :name";
		
		Query q = this.createQuery(hql);
		
		q.setParameter("name", name);
		
		try{
			user = (User)q.getSingleResult();
		}
		catch(NoResultException nre){
			//Do something here
		}
		
		return user;
	}

}
