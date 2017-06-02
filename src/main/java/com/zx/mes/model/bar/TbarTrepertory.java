package com.zx.mes.model.bar;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * TbarTrepertory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tbar_trepertory")
@DynamicInsert(true)
@DynamicUpdate(true)
public class TbarTrepertory implements java.io.Serializable {

	// Fields

	private String id;
	private Tbar tbar;
	private Trepertory trepertory;
	private Timestamp createdDateTime;
	private String remark;

	// Constructors

	/** default constructor */
	public TbarTrepertory() {
	}

	/** minimal constructor */
	public TbarTrepertory(String id, Tbar tbar, Trepertory trepertory,
			Timestamp createdDateTime) {
		this.id = id;
		this.tbar = tbar;
		this.trepertory = trepertory;
		this.createdDateTime = createdDateTime;
	}

	/** full constructor */
	public TbarTrepertory(String id, Tbar tbar, Trepertory trepertory,
			Timestamp createdDateTime, String remark) {
		this.id = id;
		this.tbar = tbar;
		this.trepertory = trepertory;
		this.createdDateTime = createdDateTime;
		this.remark = remark;
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
	@JoinColumn(name = "barId", nullable = false)
	public Tbar getTbar() {
		return this.tbar;
	}

	public void setTbar(Tbar tbar) {
		this.tbar = tbar;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "repertoryId", nullable = false)
	public Trepertory getTrepertory() {
		return this.trepertory;
	}

	public void setTrepertory(Trepertory trepertory) {
		this.trepertory = trepertory;
	}

	@Column(name = "createdDateTime", nullable = false, length = 19)
	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Column(name = "remark", length = 140)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}