package com.saltory.generate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.seasar.util.collection.Indexed;
import org.seasar.util.collection.IndexedIterator;

public class TeamGeneratorTest {

	@Test
	public void 偶数件() {
		List<String> list = new ArrayList<>();
		list.add("佐々木");
		list.add("清水");
		list.add("藤原");
		list.add("森下");
		list.add("森");
		list.add("山口");
		generate(list);
	}

	@Test
	public void 奇数件() {
		List<String> list = new ArrayList<>();
		list.add("佐々木");
		list.add("清水");
		list.add("藤原");
		list.add("森下");
		list.add("森");
		generate(list);
	}

	@Test
	public void 入力値が重複する() {
		try {
			List<String> list = new ArrayList<>();
			list.add("佐々木");
			list.add("清水");
			list.add("森");
			list.add("森下");
			list.add("森");
			generate(list);
		} catch (RuntimeException e) {
			assertThat(e.getMessage(), is("入力値が重複しています:森"));
		}
	}
	

	
	@Test
	public void ドラクエメンバー() {
		List<String> list = new ArrayList<>();
		list.add("ベニー");
		list.add("にゃん");
		list.add("いつきんぐ");
		list.add("ジン");
		list.add("やっと");
		list.add("もなか");
		list.add("たらすぱ");
		list.add("うーちゃん");
		list.add("ピトー");
		list.add("ゲオルグ");
		list.add("クロウメ");
		list.add("マリーダ");
		generate(list);
	}

	private void generate(List<String> list) {
		TeamGenerator generator = new TeamGenerator();
		List<Team> teams = generator.generate(list);
		for (Indexed<Team> indexed : IndexedIterator.indexed(teams)) {
			StringBuilder sb = new StringBuilder();
			sb.append(indexed.getIndex() + 1 + ":");
			Team t = indexed.getElement();
			sb.append(t.getFirst());
			String second = t.getSecond();
			if (second != null) {
				sb.append("/");
				sb.append(second);
			}
			System.out.println(sb.toString());
		}
	}
}
