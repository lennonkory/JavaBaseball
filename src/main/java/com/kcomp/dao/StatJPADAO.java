package com.kcomp.dao;

import com.kcomp.model.Stat;

public class StatJPADAO extends GenericJPADAO<Stat, Long> implements StatDAO{

	public StatJPADAO() {
		super(Stat.class);
	}

}
