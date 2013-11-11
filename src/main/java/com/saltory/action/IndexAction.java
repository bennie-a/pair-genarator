package com.saltory.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.saltory.form.PersonForm;

public class IndexAction {

	@ActionForm
	@Resource
	public PersonForm personForm;
	
	@Execute(validator = false)
    public String index() {
		return "index.jsp";
    }
	
	@Execute(validator = false)
	public String generate() {
		return "result.jsp";
	}
}
