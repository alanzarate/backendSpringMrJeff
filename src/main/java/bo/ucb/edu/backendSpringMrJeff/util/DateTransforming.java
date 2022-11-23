package bo.ucb.edu.backendSpringMrJeff.util;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTransforming {
    public static Date getDateFromString(String timeFoo, String dateFoo){
        Date date = new Date();
        DateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdformat.parse(dateFoo);
        } catch (ParseException e) {

            e.printStackTrace();
        }


        Calendar testDate = Calendar.getInstance();
        testDate.setTime(date);
        if(timeFoo.isEmpty()){
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

    public static String getStringNameFromDate (Date date){
        Format f = new SimpleDateFormat("EEEE");
        return f.format(date.getTime());
    }

    public static String getStringFromDateAndHour(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
    public static String getStringFromDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
    public  static String getStringFromHour(Date date){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(date);
    }

    public static Integer dateCompareTo(Date date1, Date date2){
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

    public static String getBeautyDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        String[] monthStrAll = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre"};
        return day + " de " + monthStrAll[month] + " de " + year;

    }
    public static String getBeautyDate(String dateStr){
        Date date = getDateFromString("", dateStr);
        return getBeautyDate(date);

    }
    public static String getShortTime(String time){
        String[] parts = time.split(":");
        return parts[0]+":"+parts[1];
    }

}
