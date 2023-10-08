package datetimejave8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

    public static void main(String[] args) {
          double l = 1.0;
                  if(l < 10){}
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        Period p1 = Period.ofWeeks(2);
        start.plus(p1);
        System.out.println(start);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(2).ofMonths(2).ofYears(6);
        System.out.println("period "+period);

        System.out.println("-----" +start.toEpochDay()); // number of days since January 1 1970

        cleanAnimalCage(start, end, period);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
//        System.out.println(LocalTime.now().plus(period)); // unsupported unit day

//        Period yearAndMonth = Period.ofYears(1).ofMonths(1);
        Period yearAndMonth = Period.of(1,1,0);
        System.out.println(yearAndMonth);
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plusMonths(1); // adding 1 month
        }
    }
}
