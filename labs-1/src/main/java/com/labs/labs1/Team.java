package com.labs.labs1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author LopesCaD
 *
 */

@Entity
public class Team {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team(String name) {
		super();
		this.name = name;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

}
