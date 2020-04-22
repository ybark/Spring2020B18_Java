package day12_JavaRecap;

import java.util.Scanner;

public class SallaryReport {
    /*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary = input.nextDouble();
        input.nextLine(); // ENTER de bilgi girişi olarak sayıldığından takibeden satırda input.Nextline vermek zrondayız

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter Company Name:");
        String CompanyName = input.nextLine();

        System.out.println("Ener your SSN:");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter Job Title: ");
        String jobTitle = input.nextLine();

        System.out.println("Ful Name is :" + fullName);
        System.out.println("Job Tıtle is:" + jobTitle);
        System.out.println("Compay name :" + CompanyName);
        System.out.println("SSN :" + SSN);
        System.out.println("Salary is  $ " + salary);

    }
}
