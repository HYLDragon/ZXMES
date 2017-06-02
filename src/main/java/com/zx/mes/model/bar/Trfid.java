package com.zx.mes.model.bar;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * Trfid entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trfid")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Trfid implements java.io.Serializable {

	// Fields

	private String id;
	private Tdepartment tdepartment;
	private Timestamp createdDateTime;
	private Timestamp modifyDateTime;
	private String palletNo;
	private String remark;
	private String rfid;
	private String rfidType;
	private Set<TbarTrfid> tbarTrfids = new HashSet<TbarTrfid>(0);

	// Constructors

	/** default constructor */
	public Trfid() {
	}

	/** minimal constructor */
	public Trfid(String id, Timestamp createdDateTime,
			Timestamp modifyDateTime, String palletNo, String rfid,
			String rfidType) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
		this.palletNo = palletNo;
		this.rfid = rfid;
		this.rfidType = rfidType;
	}

	/** full constructor */
	public Trfid(String id, Tdepartment tdepartment, Timestamp createdDateTime,
			Timestamp modifyDateTime, String palletNo, String remark,
			String rfid, String rfidType, Set<TbarTrfid> tbarTrfids) {
		this.id = id;
		this.tdepartment = tdepartment;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
		this.palletNo = palletNo;
		this.remark = remark;
		this.rfid = rfid;
		this.rfidType = rfidType;
		this.tbarTrfids = tbarTrfids;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departmentId")
	public Tdepartment getTdepartment() {
		return this.tdepartment;
	}

	public void setTdepartment(Tdepartment tdepartment) {
		this.tdepartment = tdepartment;
	}

	@Column(name = "createdDateTime", nullable = false, length = 19)
	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Column(name = "modifyDateTime", nullable = false, length = 19)
	public Timestamp getModifyDateTime() {
		return this.modifyDateTime;
	}

	public void setModifyDateTime(Timestamp modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}

	@Column(name = "palletNo", nullable = false, length = 40)
	public String getPalletNo() {
		return this.palletNo;
	}

	public void setPalletNo(String palletNo) {
		this.palletNo = palletNo;
	}

	@Column(name = "remark", length = 140)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "rfid", nullable = false, length = 60)
	public String getRfid() {
		return this.rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	@Column(name = "rfidType", nullable = false, length = 30)
	public String getRfidType() {
		return this.rfidType;
	}

	public void setRfidType(String rfidType) {
		this.rfidType = rfidType;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trfid")
	public Set<TbarTrfid> getTbarTrfids() {
		return this.tbarTrfids;
	}

	public void setTbarTrfids(Set<TbarTrfid> tbarTrfids) {
		this.tbarTrfids = tbarTrfids;
	}

}