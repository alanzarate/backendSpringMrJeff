package bo.ucb.edu.backendSpringMrJeff.dto;


public class BodyClothingOrderDto {
   private Integer addressId;
   private String name;
   private Double latitude;
   private Double longitude;
   private String detail;
   private String addressLink;
   private Integer timeId;
   private String date;
   private String comment;
   private Integer orderId;
   
   public BodyClothingOrderDto(){}

   public BodyClothingOrderDto(Integer addressId, String name, Double latitude, Double longitude, String detail, String addressLink, Integer timeId, String date, String comment, Integer orderId) {
       this.addressId = addressId;
       this.name = name;
       this.latitude = latitude;
       this.longitude = longitude;
       this.detail = detail;
       this.addressLink = addressLink;
       this.timeId = timeId;
       this.date = date;
       this.comment = comment;
       this.orderId = orderId;
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

   public Integer getTimeId() {
       return timeId;
   }

   public void setTimeId(Integer timeId) {
       this.timeId = timeId;
   }

   public String getDate() {
       return date;
   }

   public void setDate(String date) {
       this.date = date;
   }

   public String getComment() {
       return comment;
   }

   public void setComment(String comment) {
       this.comment = comment;
   }

   public Integer getOrderId() {
       return orderId;
   }

   public void setOrderId(Integer orderId) {
       this.orderId = orderId;
   }

   @Override
   public String toString() {
       return "BodyClothingOrderDto{" +
               "addressId=" + addressId +
               ", name='" + name + '\'' +
               ", latitude=" + latitude +
               ", longitude=" + longitude +
               ", detail='" + detail + '\'' +
               ", addressLink='" + addressLink + '\'' +
               ", timeId=" + timeId +
               ", date='" + date + '\'' +
               ", comment='" + comment + '\'' +
               ", orderId=" + orderId +
               '}';
   }
   

    
}
