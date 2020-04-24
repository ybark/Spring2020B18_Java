package day28_DateTime;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _04_Date_and_Time {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //2020-03-20 11:25:30
        LocalDate date = LocalDate.of(2020,03,20);
        LocalTime time = LocalTime.of(11,25,30);
        LocalDateTime datetime = LocalDateTime.of(date,time);

        System.out.println(datetime);

        LocalDateTime dateTime2 = LocalDateTime.of(2020,03,20,11,25,30);

        System.out.println(dateTime2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd"); // there is no year

        System.out.println(date.format(dtf));







    }

}
