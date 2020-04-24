package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_TimeFormatting {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(10,30);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a"); // formati degisken olarak biz tanimliyoruz

        System.out.println(time1.format(dtf)); // tanimladigimiz degiskeni burada kullaniyoruz

        LocalTime time2 = LocalTime.of(10,0);

        System.out.println(time2.format(dtf));

        boolean result = time1.isAfter(time2);

        System.out.println(result);
    }
}

