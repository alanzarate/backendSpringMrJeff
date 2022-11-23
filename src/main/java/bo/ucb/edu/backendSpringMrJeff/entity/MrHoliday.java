package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrHoliday {

    private Integer mrHolidaysId;
    private Date dateHoliday;
    private String detail;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;

    public MrHoliday(){}
    public MrHoliday(Integer mrHolidaysId, Date dateHoliday, String detail, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrHolidaysId = mrHolidaysId;
        this.dateHoliday = dateHoliday;
        this.detail = detail;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    @Override
    public String toString() {
        return "MrHoliday{" +
                "mrHolidaysId=" + mrHolidaysId +
                ", dateHoliday=" + dateHoliday +
                ", detail='" + detail + '\'' +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created=" + created +
                '}';
    }

    public Integer getMrHolidaysId() {
        return mrHolidaysId;
    }

    public void setMrHolidaysId(Integer mrHolidaysId) {
        this.mrHolidaysId = mrHolidaysId;
    }

    public Date getDateHoliday() {
        return dateHoliday;
    }

    public void setDateHoliday(Date dateHoliday) {
        this.dateHoliday = dateHoliday;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
