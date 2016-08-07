package com.kcomp.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Entity
public abstract class Stat extends EntityModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String team;

	
	@ManyToOne
	@JoinColumn (name = "player_id")
	private Player player;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	
	

	
	
}
