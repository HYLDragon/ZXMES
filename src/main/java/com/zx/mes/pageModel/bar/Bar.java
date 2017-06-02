package com.zx.mes.pageModel.bar;

import java.util.Date;


public class Bar implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String shortBar;
	private String matName;
	private String matLot;
	private Integer starBatch;
	private Integer endBatch;
	private Date createdDateTime;
	private Date modifyDateTime;
	private String remark;
	private Integer remainder;
	
	
	
	//显示库位
	private String kuWei;
	
	private String kuWeiDate;
	//显示出库状态
	private String state;
	//显示何种胶料
	private String matType;
	//显示是试，量，正
	private String matTypeSLZ;
	
	private String palletNo;
	
	private String palletNoDate;
	
	private Date createdDateTimeStart;
	private Date createdDateTimeEnd;
	private Date modifyDateTimeStart;
	private Date modifyDateTimeEnd;
	private String shortBarCX;
	private String matLotCX;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShortBar() {
		return shortBar;
	}
	public void setShortBar(String shortBar) {
		this.shortBar = shortBar;
	}
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public String getMatLot() {
		return matLot;
	}
	public void setMatLot(String matLot) {
		this.matLot = matLot;
	}
	public Integer getStarBatch() {
		return starBatch;
	}
	public void setStarBatch(Integer starBatch) {
		this.starBatch = starBatch;
	}
	public Integer getEndBatch() {
		return endBatch;
	}
	public void setEndBatch(Integer endBatch) {
		this.endBatch = endBatch;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Date getModifyDateTime() {
		return modifyDateTime;
	}
	public void setModifyDateTime(Date modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getRemainder() {
		return remainder;
	}
	public void setRemainder(Integer remainder) {
		this.remainder = remainder;
	}
	public String getKuWei() {
		return kuWei;
	}
	public void setKuWei(String kuWei) {
		this.kuWei = kuWei;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMatType() {
		return matType;
	}
	public void setMatType(String matType) {
		this.matType = matType;
	}
	public String getMatTypeSLZ() {
		return matTypeSLZ;
	}
	public void setMatTypeSLZ(String matTypeSLZ) {
		this.matTypeSLZ = matTypeSLZ;
	}
	/**
	 * @return the kuWeiDate
	 */
	public String getKuWeiDate() {
		return kuWeiDate;
	}
	/**
	 * @param kuWeiDate the kuWeiDate to set
	 */
	public void setKuWeiDate(String kuWeiDate) {
		this.kuWeiDate = kuWeiDate;
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
	 * @return the palletNoDate
	 */
	public String getPalletNoDate() {
		return palletNoDate;
	}
	/**
	 * @param palletNoDate the palletNoDate to set
	 */
	public void setPalletNoDate(String palletNoDate) {
		this.palletNoDate = palletNoDate;
	}
	/**
	 * @return the createdDateTimeStart
	 */
	public Date getCreatedDateTimeStart() {
		return createdDateTimeStart;
	}
	/**
	 * @param createdDateTimeStart the createdDateTimeStart to set
	 */
	public void setCreatedDateTimeStart(Date createdDateTimeStart) {
		this.createdDateTimeStart = createdDateTimeStart;
	}

	/**
	 * @return the shortBarCX
	 */
	public String getShortBarCX() {
		return shortBarCX;
	}
	/**
	 * @param shortBarCX the shortBarCX to set
	 */
	public void setShortBarCX(String shortBarCX) {
		this.shortBarCX = shortBarCX;
	}
	/**
	 * @return the matLotCX
	 */
	public String getMatLotCX() {
		return matLotCX;
	}
	/**
	 * @param matLotCX the matLotCX to set
	 */
	public void setMatLotCX(String matLotCX) {
		this.matLotCX = matLotCX;
	}
	/**
	 * @return the modifyDateTimeEnd
	 */
	public Date getModifyDateTimeEnd() {
		return modifyDateTimeEnd;
	}
	/**
	 * @param modifyDateTimeEnd the modifyDateTimeEnd to set
	 */
	public void setModifyDateTimeEnd(Date modifyDateTimeEnd) {
		this.modifyDateTimeEnd = modifyDateTimeEnd;
	}
	/**
	 * @return the createdDateTimeEnd
	 */
	public Date getCreatedDateTimeEnd() {
		return createdDateTimeEnd;
	}
	/**
	 * @param createdDateTimeEnd the createdDateTimeEnd to set
	 */
	public void setCreatedDateTimeEnd(Date createdDateTimeEnd) {
		this.createdDateTimeEnd = createdDateTimeEnd;
	}
	/**
	 * @return the modifyDateTimeStart
	 */
	public Date getModifyDateTimeStart() {
		return modifyDateTimeStart;
	}
	/**
	 * @param modifyDateTimeStart the modifyDateTimeStart to set
	 */
	public void setModifyDateTimeStart(Date modifyDateTimeStart) {
		this.modifyDateTimeStart = modifyDateTimeStart;
	}
	
}
