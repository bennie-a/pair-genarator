package com.saltory.form;

import java.util.List;

/**
 * 入力フォーム
 * 
 * @author saltory
 *
 */
public class PersonForm {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private List<String> teams;

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

}
