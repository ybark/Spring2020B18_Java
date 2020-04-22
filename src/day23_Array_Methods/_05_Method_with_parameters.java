package day23_Array_Methods;

import java.util.Scanner;

public class _05_Method_with_parameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age2 = sc.nextInt();

        EligibleToBuyAlcohol(age2);

    }



    public static void EligibleToBuyAlcohol (int age) {

        if (age>=21) {
            System.out.println("Eligible to buy alcohol");
        } else  {
            System.out.println(" Eligible to buy milk");
        }

    }






}



