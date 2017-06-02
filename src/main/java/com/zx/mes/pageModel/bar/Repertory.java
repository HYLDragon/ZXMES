package com.zx.mes.pageModel.bar;

import java.io.Serializable;
import java.sql.Timestamp;

public class Repertory implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String repertoryName;
	private Timestamp createdDateTime;
	private Timestamp modifyDateTime;
	private String remark;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRepertoryName() {
		return repertoryName;
	}
	public void setRepertoryName(String repertoryName) {
		this.repertoryName = repertoryName;
	}
	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Timestamp getModifyDateTime() {
		return modifyDateTime;
	}
	public void setModifyDateTime(Timestamp modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
