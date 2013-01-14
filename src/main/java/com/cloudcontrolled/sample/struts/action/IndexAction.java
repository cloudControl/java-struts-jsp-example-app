package com.cloudcontrolled.sample.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
@Result(name="success",location="WEB-INF/jsp/index.jsp")
public class IndexAction extends ActionSupport{
	private static final long serialVersionUID = 6658835850556770536L;
	
	private String username;
	 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	@Action(value="Welcome", results={
		@Result(name="success",location="js/welcome_user.jsp")
	})
	public String execute() {
 
		return SUCCESS;
 
	}
	 
}