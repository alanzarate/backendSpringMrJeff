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
    public Date getDateFromString(Date date, String time){
        Calendar  testDate = Calendar.getInstance();
        testDate.setTime(date);

        String[] splitted = time.split(":");
        for(int x = 0 ; x<splitted.length ; x++){
            if(x == 0){
                testDate.set(Calendar.HOUR_OF_DAY, Integer.parseInt(splitted[x]) );
            }else if(x == 1){
                testDate.set(Calendar.MINUTE, Integer.parseInt(splitted[x]));
            }else if(x == 3){
                testDate.set(Calendar.SECOND, Integer.parseInt(splitted[x]));
            }
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

    /**
     *
     * @param date1
     * @param date2
     * @return 1:  date 1 > date 2 , -1: date 1 < date 2
     */
    public Integer dateCompareNoTime(Date date1, Date date2){
        int result = date1.compareTo(date2);
        Calendar  c_date1 = Calendar.getInstance();
        c_date1.setTime(date1);
        Calendar  c_date2 = Calendar.getInstance();
        c_date2.setTime(date2);
        if(c_date1.get(Calendar.DAY_OF_MONTH) == c_date2.get(Calendar.DAY_OF_MONTH) &&
                c_date1.get(Calendar.MONTH) == c_date2.get(Calendar.MONTH) &&
                c_date1.get(Calendar.YEAR) == c_date2.get(Calendar.YEAR)
        ){
            result = 0;
        }
        return result;
    }

    public boolean containsDateInList(Date date, List<Date> dateList){
        boolean result = false;
        for(int x = 0; x < dateList.size() ; x++){
            if(dateCompareNoTime(date, dateList.get(x)) == 0){
                System.out.println("Fecha contenidaa ===== >  " + date + " =======" + dateList.get(x));
                result = true;
                x = dateList.size() + 2 ;
            }
        }
        return result;
    }

    public boolean isWeekend(Date date){
        boolean result  = false;
        Format f = new SimpleDateFormat("EEEE");
        String stringDate =  f.format(date.getTime()) ;
        if(stringDate.compareTo("Saturday") == 0 ||  stringDate.compareTo("Sunday") == 0){
            result = true;
        }
        return result;
    }

    public String getBeautyDate(Date date){

        String spanishDate = "";

        String englishDay = getStringNameFromDate(date);
        switch (englishDay) {
            case "Monday" -> spanishDate = "Lunes";
            case "Tuesday" -> spanishDate = "Martes";
            case "Wednesday" -> spanishDate = "Miercoles";
            case "Thursday" -> spanishDate = "Jueves";
            case "Friday" -> spanishDate = "Viernes";
            case "Saturday" -> spanishDate = "Sabado";
            case "Sunday" -> spanishDate = "Domingo";
        }

        return  spanishDate + " , " + getStringFromDate(date);
    }


}
