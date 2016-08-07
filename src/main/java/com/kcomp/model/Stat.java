package com.kcomp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name = "stat")
public abstract class Stat extends EntityModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String team;

	
	@ManyToOne
	@JoinColumn (name = "playerId")
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

	@Override
	public String toString() {
		return "Stat [team=" + team + ", player=" + player + "]";
	}	
	
}
