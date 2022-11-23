package bo.ucb.edu.backendSpringMrJeff.entity.auxiliar;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Schedule {
    List<ScheduleDesc> schedule;
    List<AddressDesc> address;

    public Schedule(){}
    public Schedule(List<ScheduleDesc> schedule, List<AddressDesc> address) {
        this.schedule = schedule;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule=" + schedule +
                ", address=" + address +
                '}';
    }

    public List<ScheduleDesc> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleDesc> schedule) {
        this.schedule = schedule;
    }

    public List<AddressDesc> getAddress() {
        return address;
    }

    public void setAddress(List<AddressDesc> address) {
        this.address = address;
    }

    public Date getDateFromString(String timeFoo, String dateFoo){
        Date date = new Date();
        DateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdformat.parse(dateFoo);
        } catch (ParseException e) {

            e.printStackTrace();
        }


        Calendar  testDate = Calendar.getInstance();
        testDate.setTime(date);
        if(dateFoo.isEmpty()){
            testDate.set(Calendar.HOUR_OF_DAY, 0 );
            testDate.set(Calendar.MINUTE, 0);
            testDate.set(Calendar.SECOND, 0 );
        }else{
            String[] partsTime = timeFoo.split(":");
            testDate.set(Calendar.HOUR_OF_DAY, Integer.parseInt(partsTime[0]) );
            testDate.set(Calendar.MINUTE, Integer.parseInt(partsTime[1]));
            testDate.set(Calendar.SECOND, Integer.parseInt(partsTime[2]));
        }

        return testDate.getTime();
    }

    public String getStringNameFromDate (Date date){
        Format f = new SimpleDateFormat("EEEE");
        return f.format(date.getTime());
    }

    public String getStringFromDateAndHour(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
    public String getStringFromDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
    public String getStringFromHour(Date date){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(date);
    }

    public Integer dateCompareTo(Date date1, Date date2){
        Calendar  c_date1 = Calendar.getInstance();
        c_date1.setTime(date1);
        c_date1.set(Calendar.HOUR_OF_DAY, 0 );
        c_date1.set(Calendar.MINUTE, 0);
        c_date1.set(Calendar.SECOND, 0 );

        Calendar  c_date2 = Calendar.getInstance();
        c_date2.setTime(date2);
        c_date2.set(Calendar.HOUR_OF_DAY, 0 );
        c_date2.set(Calendar.MINUTE, 0);
        c_date2.set(Calendar.SECOND, 0 );

        return c_date1.getTime().compareTo(c_date2.getTime());
    }

}
