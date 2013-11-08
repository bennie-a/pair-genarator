package com.saltory.generate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.seasar.util.collection.Indexed;
import org.seasar.util.collection.IndexedIterator;

public class PersonGenerator {

	public List<Team> generate(List<Person> persons) {
		Collections.shuffle(persons);
		List<Team> teams = new ArrayList<>();
		for (Indexed<Person> indexed : IndexedIterator.indexed(persons)) {
			if (indexed.getIndex() % 2 == 1) {
				continue;
			}
			
			Team team = new Team();
			team.setFirst(indexed.getElement());
			if (indexed.getIndex() + 1 < persons.size()) {
				team.setSecond(persons.get(indexed.getIndex() + 1));
			}
			teams.add(team);
		}
		return teams;
	}
	
	
}
