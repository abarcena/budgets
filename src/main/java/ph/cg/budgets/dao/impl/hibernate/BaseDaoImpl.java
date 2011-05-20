package ph.cg.budgets.dao.impl.hibernate;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ph.cg.budgets.bo.Entity;
import ph.cg.budgets.dao.BaseDao;

@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<T extends Entity> extends HibernateDaoSupport implements BaseDao<T> {
	protected abstract Class<T> getEntityClass();

	public T get(Serializable id) {
		return (T) getHibernateTemplate().get(getEntityClass(), id);
	}

	public List<T> findAll() {
		return getHibernateTemplate().loadAll(getEntityClass());
	}
}
