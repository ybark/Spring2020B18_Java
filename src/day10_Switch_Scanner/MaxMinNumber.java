package day10_Switch_Scanner;

import java.util.Scanner;
public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" your 1 st number :");
        int num1 = input.nextInt();
        System.out.println(" your 2nd number :");
        int num2 = input.nextInt();
        System.out.println( "your 3rd number :");
        int num3 = input.nextInt();

        int maximum = (num1>= num2 && num1>=num3)? num1: (num2>num1 && num2>num3)? num2: num3;
        int minimum = (num1<= num2 && num1<=num3)? num1: (num2<num1 && num2<num3)? num2: num3;

        System.out.println("minimum number is :" + minimum);
        System.out.println("maximum number is :" + maximum);





    }
}
