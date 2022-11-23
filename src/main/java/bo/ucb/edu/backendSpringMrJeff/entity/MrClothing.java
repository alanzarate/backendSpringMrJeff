package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrClothing {
    private Integer mrClothingId;
    private String title;
    private String description;
    private Double price;
    private String catClotStatus;
    private Integer mrCategoryClothId;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrClothing(){}

    public MrClothing(Integer mrClothingId, String title, String description, Double price, String catClotStatus, Integer mrCategoryClothId, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrClothingId = mrClothingId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.catClotStatus = catClotStatus;
        this.mrCategoryClothId = mrCategoryClothId;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrClothingId() {
        return mrClothingId;
    }

    public void setMrClothingId(Integer mrClothingId) {
        this.mrClothingId = mrClothingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCatClotStatus() {
        return catClotStatus;
    }

    public void setCatClotStatus(String catClotStatus) {
        this.catClotStatus = catClotStatus;
    }

    public Integer getMrCategoryClothId() {
        return mrCategoryClothId;
    }

    public void setMrCategoryClothId(Integer mrCategoryClothId) {
        this.mrCategoryClothId = mrCategoryClothId;
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
        return "MrClothing{" +
                "mrClothingId=" + mrClothingId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", catClotStatus='" + catClotStatus + '\'' +
                ", mrCategoryClothId=" + mrCategoryClothId +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }
}
