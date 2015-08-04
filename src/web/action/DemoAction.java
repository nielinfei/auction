package web.action;

import java.util.List;

import web.biz.DemoBiz;
import web.entity.User;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {

	private List<User> userList;
	private DemoBiz demoBiz;

	public String list() {
		userList = demoBiz.List();
		return "list";
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public DemoBiz getDemoBiz() {
		return demoBiz;
	}

	public void setDemoBiz(DemoBiz demoBiz) {
		this.demoBiz = demoBiz;
	}

}
