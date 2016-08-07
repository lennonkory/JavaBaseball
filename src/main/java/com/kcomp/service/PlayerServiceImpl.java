package com.kcomp.service;

import java.util.List;
import java.util.logging.Logger;

import com.kcomp.dao.PlayerDAO;
import com.kcomp.model.Player;

public class PlayerServiceImpl implements PlayerService{

	private final static Logger log = Logger.getLogger(PlayerServiceImpl.class.getName());
	private PlayerDAO playerDAO;
	
	@Override
	public boolean createPlayer(Player player) {
		try {
			playerDAO.save(player);
			log.info("Player saved");
		} catch(Exception e) {
			log.severe("Could not save player");
			return false;
		}
		return true;
	}

	@Override
	public List<Player> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerDAO getPlayerDao() {
		return this.playerDAO;
	}

	@Override
	public void setPlayerDAO(PlayerDAO playerDAO) {
		this.playerDAO = playerDAO;
	}

}
