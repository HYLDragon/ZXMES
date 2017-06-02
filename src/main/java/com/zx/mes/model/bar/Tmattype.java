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
 * Tmattype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmattype")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Tmattype implements java.io.Serializable {

	// Fields

	private String id;
	private Timestamp createdDateTime;
	private String matTypeName;
	private Timestamp modifyDateTime;
	private String remark;
	private Set<Tbar> tbars = new HashSet<Tbar>(0);

	// Constructors

	/** default constructor */
	public Tmattype() {
	}

	/** minimal constructor */
	public Tmattype(String id, Timestamp createdDateTime, String matTypeName,
			Timestamp modifyDateTime) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.matTypeName = matTypeName;
		this.modifyDateTime = modifyDateTime;
	}

	/** full constructor */
	public Tmattype(String id, Timestamp createdDateTime, String matTypeName,
			Timestamp modifyDateTime, String remark, Set<Tbar> tbars) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.matTypeName = matTypeName;
		this.modifyDateTime = modifyDateTime;
		this.remark = remark;
		this.tbars = tbars;
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

	@Column(name = "matTypeName", nullable = false, length = 20)
	public String getMatTypeName() {
		return this.matTypeName;
	}

	public void setMatTypeName(String matTypeName) {
		this.matTypeName = matTypeName;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tmattype")
	public Set<Tbar> getTbars() {
		return this.tbars;
	}

	public void setTbars(Set<Tbar> tbars) {
		this.tbars = tbars;
	}

}