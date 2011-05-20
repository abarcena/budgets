package ph.cg.budgets.service.impl;

import java.util.List;

import ph.cg.budgets.bo.Test;
import ph.cg.budgets.dao.TestDao;
import ph.cg.budgets.service.TestService;

public class TestServiceImpl implements TestService {

	private TestDao testDao;

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Override
	public List<Test> findAll() {
		return testDao.findAll();
	}

}
