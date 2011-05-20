package ph.cg.budgets.ui.page;

import org.apache.click.Page;
import org.apache.click.control.Column;
import org.apache.click.control.Table;
import org.springframework.stereotype.Component;

import ph.cg.budgets.service.TestService;

@Component
public class TestPage extends Page {

	private static final long serialVersionUID = 1L;

	private Table table = new Table("testTable");

	private TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public TestPage() {
		addControl(table);

		table.setClass("mars");
		table.addColumn(new Column("id"));
		table.addColumn(new Column("testColumn"));
	}

	@Override
	public void onRender() {
		table.setRowList(testService.findAll());
	}
}
