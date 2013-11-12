package com.saltory.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.util.lang.StringUtil;

import com.saltory.form.PersonForm;
import com.saltory.generate.Team;

public class IndexAction {

	@ActionForm
	@Resource
	public PersonForm personForm;

	public String message = "Seasar2";

	public List<Hoge> hogeList = new ArrayList<Hoge>();

	List<String> teams = new ArrayList<>();

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = false)
	public String generate() {
		if (StringUtil.isNotEmpty(personForm.getName())) {
			for (int i = 0; i < 3; i++) {
				Hoge hoge = new Hoge();
				hoge.aaa = "aaa" + i;
				hogeList.add(hoge);
			}
		}
		teams.add("佐々木");
		teams.add("山崎");
		teams.add("北条");
		teams.add("麻生");
		//		personForm.setTeams(teams);
		return "index.jsp";
	}

	private class Hoge {
		public String aaa;
	}
}
