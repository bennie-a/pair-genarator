package com.saltory.generate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PersonGeneratorTest {

	@Test
	public void 偶数件() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("11", "佐々木"));
		list.add(new Person("12", "清水"));
		list.add(new Person("13", "藤原"));
		list.add(new Person("14", "森下"));
		list.add(new Person("15", "森"));
		list.add(new Person("16", "山口"));
		generate(list);
	}

	
	@Test
	public void 奇数件() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("11", "佐々木"));
		list.add(new Person("12", "清水"));
		list.add(new Person("13", "藤原"));
		list.add(new Person("14", "森下"));
		list.add(new Person("15", "森"));
		generate(list);
	}

	private void generate(List<Person> list) {
		PersonGenerator generator = new PersonGenerator();
		List<Team> teams = generator.generate(list);
		for (Team t : teams) {
			StringBuilder sb = new StringBuilder();
			Person first = t.getFirst();
			sb.append(first.getId() + ":" + first.getName());
			Person second = t.getSecond();
			if (second != null) {
				sb.append(" , ");
				sb.append(second.getId() + ":" + second.getName());
			}
			System.out.println(sb.toString());
		}
	}
}
