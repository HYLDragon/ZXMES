package com.zx.mes.pageModel.bar;

import java.io.Serializable;
import java.util.Date;

public class Rfid implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String rfid;
	private String palletNo;
	private Date createdDateTime;
	private Date modifyDateTime;
	private String remark;
	
	private String dept;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getPalletNo() {
		return palletNo;
	}
	public void setPalletNo(String palletNo) {
		this.palletNo = palletNo;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Date getModifyDateTime() {
		return modifyDateTime;
	}
	public void setModifyDateTime(Date modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

}
