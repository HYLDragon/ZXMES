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
 * Tbar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tbar")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Tbar implements java.io.Serializable {

	// Fields

	private String id;
	private Tmattypeslz tmattypeslz;
	private Tmattype tmattype;
	private Timestamp createdDateTime;
	private Integer endBatch;
	private String matLot;
	private String matName;
	private Timestamp modifyDateTime;
	private Integer remainder;
	private String remark;
	private String shortBar;
	private Integer starBatch;
	private Set<TbarTrfid> tbarTrfids = new HashSet<TbarTrfid>(0);
	private Set<TbarTstate> tbarTstates = new HashSet<TbarTstate>(0);
	private Set<TbarTrepertory> tbarTrepertories = new HashSet<TbarTrepertory>(
			0);

	// Constructors

	/** default constructor */
	public Tbar() {
	}

	/** minimal constructor */
	public Tbar(String id, Timestamp createdDateTime, Integer endBatch,
			String matLot, String matName, String shortBar, Integer starBatch) {
		this.id = id;
		this.createdDateTime = createdDateTime;
		this.endBatch = endBatch;
		this.matLot = matLot;
		this.matName = matName;
		this.shortBar = shortBar;
		this.starBatch = starBatch;
	}

	/** full constructor */
	public Tbar(String id, Tmattypeslz tmattypeslz, Tmattype tmattype,
			Timestamp createdDateTime, Integer endBatch, String matLot,
			String matName, Timestamp modifyDateTime, Integer remainder,
			String remark, String shortBar, Integer starBatch,
			Set<TbarTrfid> tbarTrfids, Set<TbarTstate> tbarTstates,
			Set<TbarTrepertory> tbarTrepertories) {
		this.id = id;
		this.tmattypeslz = tmattypeslz;
		this.tmattype = tmattype;
		this.createdDateTime = createdDateTime;
		this.endBatch = endBatch;
		this.matLot = matLot;
		this.matName = matName;
		this.modifyDateTime = modifyDateTime;
		this.remainder = remainder;
		this.remark = remark;
		this.shortBar = shortBar;
		this.starBatch = starBatch;
		this.tbarTrfids = tbarTrfids;
		this.tbarTstates = tbarTstates;
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
	@JoinColumn(name = "matTypeSLZId")
	public Tmattypeslz getTmattypeslz() {
		return this.tmattypeslz;
	}

	public void setTmattypeslz(Tmattypeslz tmattypeslz) {
		this.tmattypeslz = tmattypeslz;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matTypeId")
	public Tmattype getTmattype() {
		return this.tmattype;
	}

	public void setTmattype(Tmattype tmattype) {
		this.tmattype = tmattype;
	}

	@Column(name = "createdDateTime", nullable = false, length = 19)
	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Column(name = "endBatch", nullable = false)
	public Integer getEndBatch() {
		return this.endBatch;
	}

	public void setEndBatch(Integer endBatch) {
		this.endBatch = endBatch;
	}

	@Column(name = "matLot", nullable = false, length = 30)
	public String getMatLot() {
		return this.matLot;
	}

	public void setMatLot(String matLot) {
		this.matLot = matLot;
	}

	@Column(name = "matName", nullable = false, length = 30)
	public String getMatName() {
		return this.matName;
	}

	public void setMatName(String matName) {
		this.matName = matName;
	}

	@Column(name = "modifyDateTime", length = 19)
	public Timestamp getModifyDateTime() {
		return this.modifyDateTime;
	}

	public void setModifyDateTime(Timestamp modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}

	@Column(name = "remainder")
	public Integer getRemainder() {
		return this.remainder;
	}

	public void setRemainder(Integer remainder) {
		this.remainder = remainder;
	}

	@Column(name = "remark", length = 140)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "shortBar", nullable = false, length = 30)
	public String getShortBar() {
		return this.shortBar;
	}

	public void setShortBar(String shortBar) {
		this.shortBar = shortBar;
	}

	@Column(name = "starBatch", nullable = false)
	public Integer getStarBatch() {
		return this.starBatch;
	}

	public void setStarBatch(Integer starBatch) {
		this.starBatch = starBatch;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbar")
	public Set<TbarTrfid> getTbarTrfids() {
		return this.tbarTrfids;
	}

	public void setTbarTrfids(Set<TbarTrfid> tbarTrfids) {
		this.tbarTrfids = tbarTrfids;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbar")
	public Set<TbarTstate> getTbarTstates() {
		return this.tbarTstates;
	}

	public void setTbarTstates(Set<TbarTstate> tbarTstates) {
		this.tbarTstates = tbarTstates;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbar")
	public Set<TbarTrepertory> getTbarTrepertories() {
		return this.tbarTrepertories;
	}

	public void setTbarTrepertories(Set<TbarTrepertory> tbarTrepertories) {
		this.tbarTrepertories = tbarTrepertories;
	}

}