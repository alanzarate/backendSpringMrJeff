package bo.ucb.edu.backendSpringMrJeff.entity.auxiliar;

import java.util.List;

public class ScheduleDesc {
    private String day;

    private String beautyDay;

    private List<HoursDesc> hours;

    public ScheduleDesc(){}
    public ScheduleDesc(String day, String beautyDay,  List<HoursDesc> hours) {
        this.day = day;
        this.beautyDay = beautyDay;
        this.hours = hours;
    }


    public String getBeautyDay() {
        return beautyDay;
    }

    public void setBeautyDay(String beautyDay) {
        this.beautyDay = beautyDay;
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
