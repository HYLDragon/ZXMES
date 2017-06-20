package com.zx.mes.pageModel.mes;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/6/8.
 */
public class Prfidcard implements Serializable{
    private int id;
    private BigDecimal createTime;
    private String rfid;
    private String cardNo;
    private String bar;
    private String dept;
    private String palletType;
    private String palletNo;
    private BigDecimal lastBindTime;
    private String ver1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPalletType() {
        return palletType;
    }

    public void setPalletType(String palletType) {
        this.palletType = palletType;
    }

    public String getPalletNo() {
        return palletNo;
    }

    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    public BigDecimal getLastBindTime() {
        return lastBindTime;
    }

    public void setLastBindTime(BigDecimal lastBindTime) {
        this.lastBindTime = lastBindTime;
    }

    public String getVer1() {
        return ver1;
    }

    public void setVer1(String ver1) {
        this.ver1 = ver1;
    }
}
