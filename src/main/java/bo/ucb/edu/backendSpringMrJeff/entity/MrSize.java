package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrSize {
    private Integer mrSizeId;
    private String size;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrSize(){}

    public MrSize(Integer mrSizeId, String size, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrSizeId = mrSizeId;
        this.size = size;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrSizeId() {
        return mrSizeId;
    }

    public void setMrSizeId(Integer mrSizeId) {
        this.mrSizeId = mrSizeId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        return "MrSize{" +
                "mrSizeId=" + mrSizeId +
                ", size='" + size + '\'' +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }
    
}
