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
 * Trepertory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trepertory")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Trepertory implements java.io.Serializable {

	// Fields

	private String id;
	private Trepertorylimit trepertorylimit;
	private Timestamp createdDateTime;
	private Timestamp modifyDateTime;
	private String remark;
	private String repertoryName;
	private Set<TbarTrepertory> tbarTrepertories = new HashSet<TbarTrepertory>(
			0);

	// Constructors

	/** default constructor */
	public Trepertory() {
	}

	/** minimal constructor */
	public Trepertory(String id, Timestamp createdDateTime,
			Timestamp modifyDateTime, String repertoryName) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
		this.repertoryName = repertoryName;
	}

	/** full constructor */
	public Trepertory(String id, Trepertorylimit trepertorylimit,
			Timestamp createdDateTime, Timestamp modifyDateTime, String remark,
			String repertoryName, Set<TbarTrepertory> tbarTrepertories) {
		this.id = id;
		this.trepertorylimit = trepertorylimit;
		this.createdDateTime = createdDateTime;
		this.modifyDateTime = modifyDateTime;
		this.remark = remark;
		this.repertoryName = repertoryName;
		this.tbarTrepertories = tbarTrepertories;
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
	@JoinColumn(name = "trepertorylimitId")
	public Trepertorylimit getTrepertorylimit() {
		return this.trepertorylimit;
	}

	public void setTrepertorylimit(Trepertorylimit trepertorylimit) {
		this.trepertorylimit = trepertorylimit;
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

	@Column(name = "repertoryName", nullable = false, length = 30)
	public String getRepertoryName() {
		return this.repertoryName;
	}

	public void setRepertoryName(String repertoryName) {
		this.repertoryName = repertoryName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "trepertory")
	public Set<TbarTrepertory> getTbarTrepertories() {
		return this.tbarTrepertories;
	}

	public void setTbarTrepertories(Set<TbarTrepertory> tbarTrepertories) {
		this.tbarTrepertories = tbarTrepertories;
	}

}