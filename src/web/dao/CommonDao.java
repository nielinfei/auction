package web.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("dao")
public class CommonDao extends HibernateDaoSupport implements ICommonDao {

	@Transactional(readOnly = true)
	public List findByHql(String hql, Object... params) {
		return getHT().find(hql, params);
	}

	@Transactional(readOnly = true)
	public List findByDc(DetachedCriteria dc) {
		return getHT().findByCriteria(dc);
	}

	@Transactional
	public void updateByHql(String hql, Object... params) {
		getHT().bulkUpdate(hql, params);
	}

	@Transactional(readOnly = true)
	public Object load(Class c, Serializable id) {
		return getHT().load(c, id);
	}

	@Transactional(readOnly = true)
	public List list(Class c) {
		return getHT().loadAll(c);
	}

	@Transactional
	public void del(Class c, Serializable id) {
		getHT().delete(load(c, id));
	}

	@Transactional
	public void save(Object obj) {
		getHT().merge(obj);
	}

	private HibernateTemplate getHT() {
		return getHibernateTemplate();
	}

	public void saveAll(List list){
		getHT().saveOrUpdateAll(list);
	}
	
	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

}
