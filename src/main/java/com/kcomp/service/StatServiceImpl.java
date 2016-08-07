package com.kcomp.service;

import java.util.List;
import java.util.logging.Logger;

import com.kcomp.dao.StatDAO;
import com.kcomp.model.Player;
import com.kcomp.model.Stat;

public  class StatServiceImpl implements StatService {

	private final static Logger log = Logger.getLogger(StatServiceImpl.class.getName());
	private StatDAO statDAO;
	
	public boolean createStat(Stat stat) {
		try {
			statDAO.save(stat);
			log.info("Stat saved");
		} catch(Exception e) {
			log.severe("Could not save stat");
			return false;
		}
		return true;
	}

	public List<Stat> findByPlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Stat findStatById(Long id){
		return statDAO.findById(id);
	}

	public StatDAO getStatDao() {
		return this.statDAO;
	}

	public void setStatDAO(StatDAO statDAO) {
		this.statDAO = statDAO;
	}

}
