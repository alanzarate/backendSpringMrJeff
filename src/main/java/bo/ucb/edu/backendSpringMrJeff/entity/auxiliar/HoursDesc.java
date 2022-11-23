package bo.ucb.edu.backendSpringMrJeff.entity.auxiliar;

public class HoursDesc {
    private Integer mrScheduleId;
    private String timeStart;
    private String timeEnd;
    private String detail;

    public HoursDesc(){}
    public HoursDesc(int mrScheduleId, String timeStart, String timeEnd, String detail) {
        this.mrScheduleId = mrScheduleId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "HoursDesc{" +
                "mrScheduleId=" + mrScheduleId +
                ", timeStart='" + timeStart + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                ", detail='" + detail + '\'' +
                '}';
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
}
