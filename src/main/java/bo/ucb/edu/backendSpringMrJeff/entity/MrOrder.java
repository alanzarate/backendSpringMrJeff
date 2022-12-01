package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;


public class MrOrder {
    private Integer mrOrderId;
    private String comment;
    private Integer mrCouponsId;
    private Integer mrUserId;
    private Integer mrOperationStateId;
    private Integer mrPaymentMethodId ;
    private Integer payCash;
    private Integer mrInvoiceId;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrOrder(){}
    public MrOrder(Integer mrOrderId, String comment, Integer mrCouponsId, Integer mrUserId, Integer mrOperationStateId, Integer mrPaymentMethodId, Integer payCash, Integer mrInvoiceId, Integer status, Date txDate, String txUser, String txHost, Date created) {

        this.mrOrderId = mrOrderId;
        this.comment = comment;
        this.mrCouponsId = mrCouponsId;
        this.mrUserId = mrUserId;
        this.mrOperationStateId = mrOperationStateId;
        this.mrPaymentMethodId = mrPaymentMethodId;
        this.payCash = payCash;
        this.mrInvoiceId = mrInvoiceId;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    @Override
    public String toString() {
        return "MrOrder{" +
                "mrOrderId=" + mrOrderId +
                ", comment='" + comment + '\'' +
                ", mrCouponsId=" + mrCouponsId +
                ", mrUserId=" + mrUserId +
                ", mrOperationStateId=" + mrOperationStateId +
                ", mrPaymentMethodId=" + mrPaymentMethodId +
                ", payCash=" + payCash +
                ", mrInvoiceId=" + mrInvoiceId +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }

    public Integer getMrOrderId() {
        return mrOrderId;
    }

    public void setMrOrderId(Integer mrOrderId) {
        this.mrOrderId = mrOrderId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getMrCouponsId() {
        return mrCouponsId;
    }

    public void setMrCouponsId(Integer mrCouponsId) {
        this.mrCouponsId = mrCouponsId;
    }

    public Integer getMrUserId() {
        return mrUserId;
    }

    public void setMrUserId(Integer mrUserId) {
        this.mrUserId = mrUserId;
    }

    public Integer getMrOperationStateId() {
        return mrOperationStateId;
    }

    public void setMrOperationStateId(Integer mrOperationStateId) {
        this.mrOperationStateId = mrOperationStateId;
    }

    public Integer getMrPaymentMethodId() {
        return mrPaymentMethodId;
    }

    public void setMrPaymentMethodId(Integer mrPaymentMethodId) {
        this.mrPaymentMethodId = mrPaymentMethodId;
    }

    public Integer getPayCash() {
        return payCash;
    }

    public void setPayCash(Integer payCash) {
        this.payCash = payCash;
    }

    public Integer getMrInvoiceId() {
        return mrInvoiceId;
    }

    public void setMrInvoiceId(Integer mrInvoiceId) {
        this.mrInvoiceId = mrInvoiceId;
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
