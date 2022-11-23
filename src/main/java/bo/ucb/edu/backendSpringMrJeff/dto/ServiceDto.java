package bo.ucb.edu.backendSpringMrJeff.dto;

public class ServiceDto {
    private Integer serviceId;
    private Double price;
    private String catStatus;
    private Integer principalService;
    private String size;
    private String detTitle;
    private String detDescription;

    public ServiceDto() {
    }

    public ServiceDto(Integer serviceId, Double price, String catStatus, Integer principalService, String size, String detTitle, String detDescription) {
        this.serviceId = serviceId;
        this.price = price;
        this.catStatus = catStatus;
        this.principalService = principalService;
        this.size = size;
        this.detTitle = detTitle;
        this.detDescription = detDescription;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCatStatus() {
        return catStatus;
    }

    public void setCatStatus(String catStatus) {
        this.catStatus = catStatus;
    }

    public Integer getPrincipalService() {
        return principalService;
    }

    public void setPrincipalService(Integer principalService) {
        this.principalService = principalService;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDetTitle() {
        return detTitle;
    }

    public void setDetTitle(String detTitle) {
        this.detTitle = detTitle;
    }

    public String getDetDescription() {
        return detDescription;
    }

    public void setDetDescription(String detDescription) {
        this.detDescription = detDescription;
    }
    
    @Override
    public String toString() {
        return "ServiceDto{" +
                "serviceId=" + serviceId +
                ", price=" + price +
                ", catStatus='" + catStatus + '\'' +
                ", principalService=" + principalService +
                ", size='" + size + '\'' +
                ", detTitle='" + detTitle + '\'' +
                ", detDescription='" + detDescription + '\'' +
                '}';
    }
}
