package com.saltory.generate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.seasar.util.collection.Indexed;
import org.seasar.util.collection.IndexedIterator;

/**
 * 2人チームを作成するクラス
 * 
 * @author saltory
 *
 */
public class TeamGenerator {

	/**
	 * 2人チームを作成する。
	 * 
	 * @param persons
	 * @return
	 */
	public List<Team> generate(List<String> persons) {
		Set<String> set = new HashSet<>();
		for (Indexed<String> indexed : IndexedIterator.indexed(persons)) {
			if (set.contains(indexed.getElement()) == true) {
				throw new RuntimeException("入力値が重複しています:" + indexed.getElement());
			}
			set.add(indexed.getElement());
		}
		
		Collections.shuffle(persons);
		List<Team> teams = new ArrayList<>();
		for (Indexed<String> indexed : IndexedIterator.indexed(persons)) {
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
