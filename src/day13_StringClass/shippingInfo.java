package day13_StringClass;

import java.util.Scanner;

public class shippingInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number:");
        String building = input.next(); //

        input.nextLine(); // <enter> absorbed

        System.out.println("Enter your street address:");
        String streetAddress = input.nextLine();



        System.out.println("Enter your City name:");
        String city= input.nextLine();

        System.out.println("Enter your state:");
        String stateName = input.next();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String result ="Ship to :"+ fullName + "\n\t\t " + building +" " + streetAddress+" "+
                "\n\t\t" + city+", "+ stateName+" " + zipCode;


        System.out.println(result);
    }


}
