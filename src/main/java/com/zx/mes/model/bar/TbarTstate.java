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
 * TbarTstate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tbar_tstate")
@DynamicInsert(true)
@DynamicUpdate(true)
public class TbarTstate implements java.io.Serializable {

	// Fields

	private String id;
	private Tbar tbar;
	private Tstatebar tstatebar;
	private Timestamp createtime;
	private String remark;

	// Constructors

	/** default constructor */
	public TbarTstate() {
	}

	/** minimal constructor */
	public TbarTstate(String id, Tbar tbar, Tstatebar tstatebar) {
		this.id = id;
		this.tbar = tbar;
		this.tstatebar = tstatebar;
	}

	/** full constructor */
	public TbarTstate(String id, Tbar tbar, Tstatebar tstatebar,
			Timestamp createtime, String remark) {
		this.id = id;
		this.tbar = tbar;
		this.tstatebar = tstatebar;
		this.createtime = createtime;
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
	@JoinColumn(name = "barid", nullable = false)
	public Tbar getTbar() {
		return this.tbar;
	}

	public void setTbar(Tbar tbar) {
		this.tbar = tbar;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stateid", nullable = false)
	public Tstatebar getTstatebar() {
		return this.tstatebar;
	}

	public void setTstatebar(Tstatebar tstatebar) {
		this.tstatebar = tstatebar;
	}

	@Column(name = "createtime", length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Column(name = "remark", length = 140)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}