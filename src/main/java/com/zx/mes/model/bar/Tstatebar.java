package com.zx.mes.model.bar;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * Tstatebar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tstatebar")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Tstatebar implements java.io.Serializable {

	// Fields

	private String id;
	private Timestamp createdDateTime;
	private Timestamp modifyDateTime;
	private String remark;
	private String stateName;
	private Set<TbarTstate> tbarTstates = new HashSet<TbarTstate>(0);

	// Constructors

	/** default constructor */
	public Tstatebar() {
	}

	/** minimal constructor */
	public Tstatebar(String id, Timestamp createdDateTime,
			Timestamp modifyDateTime, String stateName) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
		this.stateName = stateName;
	}

	/** full constructor */
	public Tstatebar(String id, Timestamp createdDateTime,
			Timestamp modifyDateTime, String remark, String stateName,
			Set<TbarTstate> tbarTstates) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
		this.remark = remark;
		this.stateName = stateName;
		this.tbarTstates = tbarTstates;
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

	@Column(name = "remark", length = 140)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "stateName", nullable = false, length = 10)
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tstatebar")
	public Set<TbarTstate> getTbarTstates() {
		return this.tbarTstates;
	}

	public void setTbarTstates(Set<TbarTstate> tbarTstates) {
		this.tbarTstates = tbarTstates;
	}

}