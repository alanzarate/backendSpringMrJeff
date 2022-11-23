package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrCategoryCloth {
    private Integer mrCategoryClothId;
    private String category;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrCategoryCloth(){}

    public MrCategoryCloth(Integer mrCategoryClothId, String category, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrCategoryClothId = mrCategoryClothId;
        this.category = category;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrCategoryClothId() {
        return mrCategoryClothId;
    }

    public void setMrCategoryClothId(Integer mrCategoryClothId) {
        this.mrCategoryClothId = mrCategoryClothId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        return "MrCategoryCloth{" +
                "mrCategoryClothId=" + mrCategoryClothId +
                ", category='" + category + '\'' +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }
}
