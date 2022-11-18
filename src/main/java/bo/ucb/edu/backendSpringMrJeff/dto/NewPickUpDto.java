package bo.ucb.edu.backendSpringMrJeff.dto;

import java.util.Date;

public class NewPickUpDto {
    private Integer addressId;
    private String name;
    private Double latitude;
    private Double longitude;
    private String detail;
    private String addressLink;
    private Integer userId;
    private Integer timeId;
    private Date date;

    public NewPickUpDto(){}

    public NewPickUpDto(Integer addressId, String name, Double latitude, Double longitude, String detail, String addressLink, Integer userId, Integer timeId, Date date) {
        this.addressId = addressId;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.detail = detail;
        this.addressLink = addressLink;
        this.userId = userId;
        this.timeId = timeId;
        this.date = date;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
