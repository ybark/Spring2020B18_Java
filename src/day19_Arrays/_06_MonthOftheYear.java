package day19_Arrays;

import java.util.Scanner;

public class _06_MonthOftheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] month = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        System.out.println("Enter the number of the mounth  :");
        int num = sc.nextInt();
        System.out.println(num +". mounth's name is ==> "+month[num-1]);
    }
}
