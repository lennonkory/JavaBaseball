package com.kcomp.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "pitcher_stat")
public class PitcherStat extends Stat{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int strikeouts;

	public int getStrikeouts() {
		return strikeouts;
	}

	public void setStrikeouts(int strikeouts) {
		this.strikeouts = strikeouts;
	}

	@Override
	public String toString() {
		return "PitcherStat ["+ super.toString() +" strikeouts=" + strikeouts + "]";
	}
	
	
}
