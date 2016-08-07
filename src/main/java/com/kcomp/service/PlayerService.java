package com.kcomp.service;

import java.util.List;

import com.kcomp.dao.PlayerDAO;
import com.kcomp.model.Player;

public interface PlayerService {
	
	boolean createPlayer(Player player);
	List<Player> findByLastName(String lastName);
	public PlayerDAO getPlayerDao();
	public void setPlayerDAO(PlayerDAO playerDAO);

}
