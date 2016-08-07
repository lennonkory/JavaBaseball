package com.kcomp.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kcomp.dao.PlayerJPADAO;
import com.kcomp.dao.StatJPADAO;
import com.kcomp.service.PlayerService;
import com.kcomp.service.PlayerServiceImpl;
import com.kcomp.service.StatService;
import com.kcomp.service.StatServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@Configuration
public class Config {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public Config(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Bean
	StatService statService(){
		
		StatJPADAO statJPADAO = new StatJPADAO();
		statJPADAO.setEntityManager(this.entityManager);	    
	   	StatService statService = new StatServiceImpl();	    
	   	statService.setStatDAO(statJPADAO);	   	
	   	return statService;
	   	
	}
	
	@Bean
	PlayerService playerService(){
		
		PlayerJPADAO playerJPADAO = new PlayerJPADAO();
		playerJPADAO.setEntityManager(this.entityManager);	    
		PlayerService playerService = new PlayerServiceImpl();	    
		playerService.setPlayerDAO(playerJPADAO);	   	
	   	return playerService;
	   	
	}
	
}
