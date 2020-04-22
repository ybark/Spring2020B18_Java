package day19_Arrays;

import java.util.Scanner;

public class _05_Array_daysOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] days = {"Monday","Tuesday","Wednesday",
                            "Thursday","Friday","Saturday","Sunday"};
        while (true) {
            System.out.println("Enter the number of the day <0> for exit : ");
            int number = sc.nextInt();
            if (number==0){
                System.exit(0);
            } else if (number<1 || number>7){
                System.out.println("invalid entry");
            }  else {
                System.out.println(number + ". day of the week is ==> " + days[number - 1]);
            }
        }
    }
}
