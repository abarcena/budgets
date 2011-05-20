package ph.cg.budgets.dao.impl.hibernate;

import ph.cg.budgets.bo.Test;
import ph.cg.budgets.dao.TestDao;

public class TestDaoImpl extends BaseDaoImpl<Test> implements TestDao {

	protected Class<Test> getEntityClass() {
		return Test.class;
	}

}
