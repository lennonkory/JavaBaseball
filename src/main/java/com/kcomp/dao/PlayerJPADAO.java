package com.kcomp.dao;

import com.kcomp.model.Player;


public class PlayerJPADAO extends GenericJPADAO<Player, Long> implements PlayerDAO {

	public PlayerJPADAO() {
		super(Player.class);
	}

}
