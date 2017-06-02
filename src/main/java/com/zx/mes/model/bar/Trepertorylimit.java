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
 * Trepertorylimit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trepertorylimit")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Trepertorylimit implements java.io.Serializable {

	// Fields

	private String id;
	private Tdepartment tdepartment;
	private Timestamp createdDateTime;
	private String limitName1;
	private String limitName2;
	private String limitName3;
	private Timestamp modifyDateTime;
	private String remark;
	private Set<Trepertory> trepertories = new HashSet<Trepertory>(0);

	// Constructors

	/** default constructor */
	public Trepertorylimit() {
	}

	/** minimal constructor */
	public Trepertorylimit(String id, Timestamp createdDateTime,
			Timestamp modifyDateTime) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
	}

	/** full constructor */
	public Trepertorylimit(String id, Tdepartment tdepartment,
			Timestamp createdDateTime, String limitName1, String limitName2,
			String limitName3, Timestamp modifyDateTime, String remark,
			Set<Trepertory> trepertories) {
		this.id = id;
		this.tdepartment = tdepartment;
		this.createdDateTime = createdDateTime;
		this.limitName1 = limitName1;
		this.limitName2 = limitName2;
		this.limitName3 = limitName3;
		this.modifyDateTime = modifyDateTime;
		this.remark = remark;
		this.trepertories = trepertories;
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

	@Column(name = "limitName1", length = 30)
	public String getLimitName1() {
		return this.limitName1;
	}

	public void setLimitName1(String limitName1) {
		this.limitName1 = limitName1;
	}

	@Column(name = "limitName2", length = 30)
	public String getLimitName2() {
		return this.limitName2;
	}

	public void setLimitName2(String limitName2) {
		this.limitName2 = limitName2;
	}

	@Column(name = "limitName3", length = 30)
	public String getLimitName3() {
		return this.limitName3;
	}

	public void setLimitName3(String limitName3) {
		this.limitName3 = limitName3;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trepertorylimit")
	public Set<Trepertory> getTrepertories() {
		return this.trepertories;
	}

	public void setTrepertories(Set<Trepertory> trepertories) {
		this.trepertories = trepertories;
	}

}