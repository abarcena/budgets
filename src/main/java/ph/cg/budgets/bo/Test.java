package ph.cg.budgets.bo;

public class Test extends Entity {

	private static final long serialVersionUID = 6655305934990514734L;

	private String testColumn;

	public Test() {
	}

	public Test(Long id) {
		super.setId(id);
	}

	public Test(Long id, String testColumn) {
		super.setId(id);
		this.testColumn = testColumn;
	}

	public Long getId() {
		return (Long) super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}

	public String getTestColumn() {
		return testColumn;
	}

	public void setTestColumn(String testColumn) {
		this.testColumn = testColumn;
	}
}
