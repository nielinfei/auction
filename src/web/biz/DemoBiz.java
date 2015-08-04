package web.biz;

import java.util.List;

import org.springframework.stereotype.Service;

import web.entity.User;

@Service("demoBiz")
public class DemoBiz extends BaseBiz {

	public List<User> List() {
		return dao.list(User.class);
	}
}
