package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class _04_MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int max = -2147483648;
        int min =  2147483647;
        int i =1;
        while (i<=3) {

            System.out.println(" Enter a number");
            int num = sc.nextInt();
            if (num > max){
                max=num;
            }
            if (num < min) {
                min = num;
            }

            i++;
        }
        System.out.println("Maximum number is :" + max);
        System.out.println("Minimum number is :" + min);



    }
}
