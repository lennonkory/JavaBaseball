package com.kcomp.service;

import java.util.List;

import com.kcomp.dao.StatDAO;
import com.kcomp.model.Player;
import com.kcomp.model.Stat;

public interface StatService {
	
	boolean createStat(Stat stat);
	List<Stat> findByPlayer(Player player);
	public StatDAO getStatDao();
	public void setStatDAO(StatDAO statDAO);

}
