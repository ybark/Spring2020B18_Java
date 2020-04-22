package day10_Switch_Scanner;

import java.util.Scanner;


public class scannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter byte value");
        byte num1= input.nextByte();

        System.out.println("You have enter number" + num1);
        if (num1 %2 ==0) {
            System.out.println("you have entered even number");
        } else System.out.println("you have entered odd number");
        System.out.println(num1);
    }

}
