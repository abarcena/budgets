package ph.cg.budgets.dao;

import java.io.Serializable;
import java.util.List;

import ph.cg.budgets.bo.Entity;

public interface BaseDao<T extends Entity> {

	T get(Serializable id);

	List<T> findAll();
}
