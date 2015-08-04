package web.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface ICommonDao {
	
	
	public List findByHql(String hql, Object... params);
	
	public List findByDc(DetachedCriteria dc);
	
	public void updateByHql(String hql, Object... params);

	public void save(Object obj);
	
	public Object load(Class c, Serializable id);
	
	public List list(Class c);
	
	public void del(Class c, Serializable id);
	
	public void saveAll(List list);

}