package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrClothingOrder {
    private Integer mrClothingOrderId;
    private Double price;
    private Integer quantity;
    private Integer mrServiceId;
    private Integer mrOrderId;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;
    

    public MrClothingOrder(){}

    public MrClothingOrder(Integer mrClothingOrderId, Double price, Integer quantity, Integer mrServiceId, Integer mrOrderId, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrClothingOrderId = mrClothingOrderId;
        this.price = price;
        this.quantity = quantity;
        this.mrServiceId = mrServiceId;
        this.mrOrderId = mrOrderId;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrClothingOrderId() {
        return mrClothingOrderId;
    }

    public void setMrClothingOrderId(Integer mrClothingOrderId) {
        this.mrClothingOrderId = mrClothingOrderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getMrServiceId() {
        return mrServiceId;
    }

    public void setMrServiceId(Integer mrServiceId) {
        this.mrServiceId = mrServiceId;
    }

    public Integer getMrOrderId() {
        return mrOrderId;
    }

    public void setMrOrderId(Integer mrOrderId) {
        this.mrOrderId = mrOrderId;
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

    @Override
    public String toString() {
        return "MrClothingOrder{" +
                "mrClothingOrderId=" + mrClothingOrderId +
                ", price=" + price +
                ", quantity=" + quantity +
                ", mrServiceId=" + mrServiceId +
                ", mrOrderId=" + mrOrderId +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }
}
