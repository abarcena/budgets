package ph.cg.budgets.bo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public abstract class Entity implements Serializable {

	private Serializable id;

	private Long insertId;

	private Date insertDate;

	private Long updateId;

	private Date updateDate;

	protected Serializable getId() {
		return id;
	}

	protected void setId(Serializable id) {
		this.id = id;
	}

	public Long getInsertId() {
		return insertId;
	}

	public void setInsertId(Long insertId) {
		this.insertId = insertId;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Long getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
