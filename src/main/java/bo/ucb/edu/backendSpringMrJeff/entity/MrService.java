package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrService {
    private Integer mrServiceId;
    private Double price;
    private String catSerStatus;
    private Integer mrServiceDetailId;
    private Integer mrClothingId;
    private Integer principalService;
    private Integer mrSizeId;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrService(){}

    public MrService(Integer mrServiceId, Double price, String catSerStatus, Integer mrServiceDetailId, Integer mrClothingId, Integer principalService, Integer mrSizeId, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrServiceId = mrServiceId;
        this.price = price;
        this.catSerStatus = catSerStatus;
        this.mrServiceDetailId = mrServiceDetailId;
        this.mrClothingId = mrClothingId;
        this.principalService = principalService;
        this.mrSizeId = mrSizeId;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrServiceId() {
        return mrServiceId;
    }

    public void setMrServiceId(Integer mrServiceId) {
        this.mrServiceId = mrServiceId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCatSerStatus() {
        return catSerStatus;
    }

    public void setCatSerStatus(String catSerStatus) {
        this.catSerStatus = catSerStatus;
    }

    public Integer getMrServiceDetailId() {
        return mrServiceDetailId;
    }

    public void setMrServiceDetailId(Integer mrServiceDetailId) {
        this.mrServiceDetailId = mrServiceDetailId;
    }

    public Integer getMrClothingId() {
        return mrClothingId;
    }

    public void setMrClothingId(Integer mrClothingId) {
        this.mrClothingId = mrClothingId;
    }

    public Integer getPrincipalService() {
        return principalService;
    }

    public void setPrincipalService(Integer principalService) {
        this.principalService = principalService;
    }

    public Integer getMrSizeId() {
        return mrSizeId;
    }

    public void setMrSizeId(Integer mrSizeId) {
        this.mrSizeId = mrSizeId;
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
        return "MrService{" +
                "mrServiceId=" + mrServiceId +
                ", price=" + price +
                ", catSerStatus='" + catSerStatus + '\'' +
                ", mrServiceDetailId=" + mrServiceDetailId +
                ", mrClothingId=" + mrClothingId +
                ", principalService=" + principalService +
                ", mrSizeId=" + mrSizeId +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }

}
