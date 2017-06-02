package com.zx.mes.pageModel.bar;

import java.io.Serializable;
import java.util.Date;

public class Barrfid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String shortbar;
	private String rfid;
	private Date createdDateTime;
	private String remark;
	private String name;
	private String palletNo;
	private String oldbar;
	private String rfidId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShortbar() {
		return shortbar;
	}
	public void setShortbar(String shortbar) {
		this.shortbar = shortbar;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the palletNo
	 */
	public String getPalletNo() {
		return palletNo;
	}
	/**
	 * @param palletNo the palletNo to set
	 */
	public void setPalletNo(String palletNo) {
		this.palletNo = palletNo;
	}
	/**
	 * @return the oldbar
	 */
	public String getOldbar() {
		return oldbar;
	}
	/**
	 * @param oldbar the oldbar to set
	 */
	public void setOldbar(String oldbar) {
		this.oldbar = oldbar;
	}
	/**
	 * @return the rfidId
	 */
	public String getRfidId() {
		return rfidId;
	}
	/**
	 * @param rfidId the rfidId to set
	 */
	public void setRfidId(String rfidId) {
		this.rfidId = rfidId;
	}

}
