package com.saltory.generate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TeamGeneratorTest {

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
	
	@Test
	public void ドラクエメンバー() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("11", "ベニー"));
		list.add(new Person("12", "にゃん"));
		list.add(new Person("13", "いつきんぐ"));
		list.add(new Person("14", "ジン"));
		list.add(new Person("15", "やっと"));
		list.add(new Person("16", "もなか"));
		list.add(new Person("17", "たらすぱ"));
		list.add(new Person("18", "うーちゃん"));
		list.add(new Person("19", "ピトー"));
		list.add(new Person("20", "ゲオルグ"));
		list.add(new Person("21", "クロウメ"));
		list.add(new Person("22", "マリーダ"));
		generate(list);
		
	}

	private void generate(List<Person> list) {
		TeamGenerator generator = new TeamGenerator();
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
