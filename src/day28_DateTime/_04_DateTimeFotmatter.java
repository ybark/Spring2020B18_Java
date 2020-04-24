package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _04_DateTimeFotmatter {

    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println(datetime1);

        // 12/25/2015 11:30 am

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy hh:mm:ss a");

        System.out.println(datetime1.format(dtf));

        // 12/25/2015 11:30 am, Fri

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyy hh:mm:ss a, EEE");

        System.out.println(datetime1.format(dtf2));

        // Fri, 12/25/2015 11:30 am

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEE, MM/dd/yyy hh:mm:ss a");

        System.out.println(datetime1.format(dtf3));



        // 12/25 11:30 am, Fri

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM/dd/ hh:mm a, EEE");

        System.out.println(datetime1.format(dtf4));

        String str = datetime1.format(dtf);

        System.out.println(str);

    }
}
