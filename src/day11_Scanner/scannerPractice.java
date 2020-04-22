package day11_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */
public class scannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First name:");
        String name = scan.nextLine();
        System.out.println("Enter Last name:");
        String lastName = scan.next();
        System.out.println("Employed or not:");
        boolean isEmployed = scan.nextBoolean();
        int salary = 0;

        if(isEmployed){
            System.out.println(" What is your salary:");
            salary = scan.nextInt();
        }
        System.out.println("full name :"+ name +" "+ lastName);
        System.out.println("employed status is:" + isEmployed);
        if (isEmployed) {
            System.out.println("salary :" + salary);
        }

    }
}
