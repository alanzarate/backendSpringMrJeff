package bo.ucb.edu.backendSpringMrJeff.dto;

public class AddressResDto {

    private Integer mrAddressId;
    private Double latitude;
    private Double longitude;
    private String name;
    private String detail;
    private String addressLink;

    public AddressResDto(){}
    public AddressResDto(Integer mrAddressId, Double latitude, Double longitude, String name, String detail, String addressLink) {
        this.mrAddressId = mrAddressId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.detail = detail;
        this.addressLink = addressLink;
    }

    @Override
    public String toString() {
        return "AddressResDto{" +
                "mrAddressId=" + mrAddressId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", addressLink='" + addressLink + '\'' +
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
}
