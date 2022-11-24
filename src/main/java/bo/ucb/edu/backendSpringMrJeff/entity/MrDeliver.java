package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrDeliver {
    private Integer mrDeliverId;
    private Date dateOpe;
    private Integer mrOperationStateId;
    private Integer mrAddressId;
    private Integer mrUserId;
    private Integer mrScheduleId;
    private Integer mrOrderId;
    private String codeGen;
    private Date timestampPlaned;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrDeliver(){}
    public MrDeliver(Integer mrDeliverId, Date dateOpe, Integer mrOperationStateId, Integer mrAddressId, Integer mrUserId, Integer mrScheduleId, Integer mrOrderId, String codeGen,Date timestampPlaned, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrDeliverId = mrDeliverId;
        this.dateOpe = dateOpe;
        this.mrOperationStateId = mrOperationStateId;
        this.mrAddressId = mrAddressId;
        this.mrUserId = mrUserId;
        this.mrScheduleId = mrScheduleId;
        this.mrOrderId = mrOrderId;
        this.codeGen = codeGen;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
        this.timestampPlaned = timestampPlaned;
    }

    public Date getTimestampPlaned() {
        return timestampPlaned;
    }

    public void setTimestampPlaned(Date timestampPlaned) {
        this.timestampPlaned = timestampPlaned;
    }

    public Integer getMrDeliverId() {
        return mrDeliverId;
    }

    public void setMrDeliverId(Integer mrDeliverId) {
        this.mrDeliverId = mrDeliverId;
    }

    public Date getDateOpe() {
        return dateOpe;
    }

    public void setDateOpe(Date dateOpe) {
        this.dateOpe = dateOpe;
    }

    public Integer getMrOperationStateId() {
        return mrOperationStateId;
    }

    public void setMrOperationStateId(Integer mrOperationStateId) {
        this.mrOperationStateId = mrOperationStateId;
    }

    public Integer getMrAddressId() {
        return mrAddressId;
    }

    public void setMrAddressId(Integer mrAddressId) {
        this.mrAddressId = mrAddressId;
    }

    public Integer getMrUserId() {
        return mrUserId;
    }

    public void setMrUserId(Integer mrUserId) {
        this.mrUserId = mrUserId;
    }

    public Integer getMrScheduleId() {
        return mrScheduleId;
    }

    public void setMrScheduleId(Integer mrScheduleId) {
        this.mrScheduleId = mrScheduleId;
    }

    public Integer getMrOrderId() {
        return mrOrderId;
    }

    public void setMrOrderId(Integer mrOrderId) {
        this.mrOrderId = mrOrderId;
    }

    public String getCodeGen() {
        return codeGen;
    }

    public void setCodeGen(String codeGen) {
        this.codeGen = codeGen;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
