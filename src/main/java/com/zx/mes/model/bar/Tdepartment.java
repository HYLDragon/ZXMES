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
 * Tdepartment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tdepartment")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Tdepartment implements java.io.Serializable {

	// Fields

	private String id;
	private Tdepartment tdepartment;
	private Timestamp createdDateTime;
	private String departName;
	private Timestamp modifyDateTime;
	private String remark;
	private Set<Trepertorylimit> trepertorylimits = new HashSet<Trepertorylimit>(
			0);
	private Set<Trfid> trfids = new HashSet<Trfid>(0);
	private Set<Tdepartment> tdepartments = new HashSet<Tdepartment>(0);

	// Constructors

	/** default constructor */
	public Tdepartment() {
	}

	/** minimal constructor */
	public Tdepartment(String id, Timestamp createdDateTime, String departName,
			Timestamp modifyDateTime) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.departName = departName;
		this.modifyDateTime = modifyDateTime;
	}

	/** full constructor */
	public Tdepartment(String id, Tdepartment tdepartment,
			Timestamp createdDateTime, String departName,
			Timestamp modifyDateTime, String remark,
			Set<Trepertorylimit> trepertorylimits, Set<Trfid> trfids,
			Set<Tdepartment> tdepartments) {
		this.id = id;
		this.tdepartment = tdepartment;
		this.createdDateTime = createdDateTime;
		this.departName = departName;
		this.modifyDateTime = modifyDateTime;
		this.remark = remark;
		this.trepertorylimits = trepertorylimits;
		this.trfids = trfids;
		this.tdepartments = tdepartments;
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
	@JoinColumn(name = "pid")
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

	@Column(name = "departName", nullable = false, length = 40)
	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tdepartment")
	public Set<Trepertorylimit> getTrepertorylimits() {
		return this.trepertorylimits;
	}

	public void setTrepertorylimits(Set<Trepertorylimit> trepertorylimits) {
		this.trepertorylimits = trepertorylimits;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tdepartment")
	public Set<Trfid> getTrfids() {
		return this.trfids;
	}

	public void setTrfids(Set<Trfid> trfids) {
		this.trfids = trfids;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tdepartment")
	public Set<Tdepartment> getTdepartments() {
		return this.tdepartments;
	}

	public void setTdepartments(Set<Tdepartment> tdepartments) {
		this.tdepartments = tdepartments;
	}

}