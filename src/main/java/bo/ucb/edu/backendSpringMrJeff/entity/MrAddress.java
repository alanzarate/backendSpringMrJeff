package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrAddress {
    private Integer mrAddressId;
    private Double latitude;
    private Double longitude;
    private String name;
    private String detail;
    private String addressLink;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrAddress(){}
    public MrAddress(Integer mrAddressId, Double latitude, Double longitude, String name, String detail, String addressLink, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrAddressId = mrAddressId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.detail = detail;
        this.addressLink = addressLink;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    @Override
    public String toString() {
        return "MrAddress{" +
                "mrAddressId=" + mrAddressId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", addressLink='" + addressLink + '\'' +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }

    public Integer getMrAddressId() {
        return mrAddressId;
    }

    public void setMrAddressId(Integer mrAddressId) {
        this.mrAddressId = mrAddressId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddressLink() {
        return addressLink;
    }

    public void setAddressLink(String addressLink) {
        this.addressLink = addressLink;
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
