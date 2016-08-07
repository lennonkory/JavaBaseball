package com.kcomp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "batter_stat")
public class BatterStat extends Stat {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int homeruns;


	public int getHomeruns() {
		return homeruns;
	}

	public void setHomeruns(int homeruns) {
		this.homeruns = homeruns;
	}

	@Override
	public String toString() {
		return "BatterStat ["+ super.toString() +" homeruns=" + homeruns + "]";
	}
	
	
	
}
