package com.zx.mes.model.mes;

import java.math.BigDecimal;

public class Rfidcard {
    private Integer id;

    private BigDecimal createtime;

    private String rfid;

    private String cardno;

    private String bar;

    private String dept;

    private String pallettype;

    private String palletno;

    private BigDecimal lastbindtime;

    private String ver1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCreatetime() {
        return createtime;
    }

    public void setCreatetime(BigDecimal createtime) {
        this.createtime = createtime;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar == null ? null : bar.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getPallettype() {
        return pallettype;
    }

    public void setPallettype(String pallettype) {
        this.pallettype = pallettype == null ? null : pallettype.trim();
    }

    public String getPalletno() {
        return palletno;
    }

    public void setPalletno(String palletno) {
        this.palletno = palletno == null ? null : palletno.trim();
    }

    public BigDecimal getLastbindtime() {
        return lastbindtime;
    }

    public void setLastbindtime(BigDecimal lastbindtime) {
        this.lastbindtime = lastbindtime;
    }

    public String getVer1() {
        return ver1;
    }

    public void setVer1(String ver1) {
        this.ver1 = ver1 == null ? null : ver1.trim();
    }
}