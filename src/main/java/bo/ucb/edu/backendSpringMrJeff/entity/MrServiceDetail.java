package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrServiceDetail {
    private Integer mrServiceDetailId;
    private String title;
    private String description;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;
    
    public MrServiceDetail(){}

    public MrServiceDetail(Integer mrServiceDetailId, String title, String description, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrServiceDetailId = mrServiceDetailId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrServiceDetailId() {
        return mrServiceDetailId;
    }

    public void setMrServiceDetailId(Integer mrServiceDetailId) {
        this.mrServiceDetailId = mrServiceDetailId;
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
        return "MrServiceDetail{" +
                "mrServiceDetailId=" + mrServiceDetailId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }
    
}
