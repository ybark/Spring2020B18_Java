package day10_Switch_Scanner;

import java.util.Scanner;

public class rateCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter salary==> ");
        double salary = input.nextDouble();
        System.out.println(" How many hours are you working in a week");
        byte hour = input.nextByte();
        double rate = 0;

        rate = (salary/(52*hour));
        System.out.println("hourly rate is ==> " + rate);


    }
}
