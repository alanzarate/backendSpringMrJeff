package bo.ucb.edu.backendSpringMrJeff.entity.auxiliar;

import java.util.List;

public class ScheduleDesc {
    private String day;

    private List<HoursDesc> hours;

    public ScheduleDesc(){}
    public ScheduleDesc(String day, List<HoursDesc> hours) {
        this.day = day;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "ScheduleDesc{" +
                "day='" + day + '\'' +
                ", hours=" + hours +
                '}';
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<HoursDesc> getHours() {
        return hours;
    }

    public void setHours(List<HoursDesc> hours) {
        this.hours = hours;
    }
}
