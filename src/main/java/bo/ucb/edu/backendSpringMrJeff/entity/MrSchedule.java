package bo.ucb.edu.backendSpringMrJeff.entity;

public class MrSchedule {
    private Integer mrScheduleId;
    private String timeStart;
    private String timeEnd;
    private String detail;
    private Integer status;

    public MrSchedule(){}

    public MrSchedule(Integer mrScheduleId, String timeStart, String timeEnd, String detail, Integer status) {
        this.mrScheduleId = mrScheduleId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.detail = detail;
        this.status = status;
    }

    public Integer getMrScheduleId() {
        return mrScheduleId;
    }

    public void setMrScheduleId(Integer mrScheduleId) {
        this.mrScheduleId = mrScheduleId;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
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

    @Override
    public String toString() {
        return "MrSchedule{" +
                "mrScheduleId=" + mrScheduleId +
                ", timeStart='" + timeStart + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                ", detail='" + detail + '\'' +
                ", status=" + status +
                '}';
    }
}
