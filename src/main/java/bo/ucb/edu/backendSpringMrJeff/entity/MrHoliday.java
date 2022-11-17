package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrHoliday {
    private Date dateHoliday;
    private String detail;
    private Integer status;

    public MrHoliday(){}
    public MrHoliday(Date dateHoliday, String detail, Integer status) {
        this.dateHoliday = dateHoliday;
        this.detail = detail;
        this.status = status;
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
}
