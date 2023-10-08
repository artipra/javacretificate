package datetimejave8;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime{

    public static void main(String [] args){

//        LocalDate localdate = new LocalDate();
//        LocalTime localtime = new LocalTime();
//        LocalDateTime datetime = new LocalDateTime();
//
//        System.out.println(localdate);
//        System.out.println(localtime);
//        System.out.println(datetime);

        LocalDate localDate1 = LocalDate.ofYearDay(2017,35);
        LocalTime localTime1 = LocalTime.of(10,30);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1,localTime1);

        System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);

        Date date1 = new Date();
        System.out.println(date1);
        Calendar cal = Calendar.getInstance();
        cal.set(2015, Calendar.JANUARY,1);
        Date january = cal.getTime();
        System.out.println(january);

    }



}