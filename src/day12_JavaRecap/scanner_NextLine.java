// 7925 JonesBranch Dr, McLean VA, 22034
// fullAddress: Building-number  Street, city, state zipcode

package day12_JavaRecap;

import java.util.Scanner;

public class scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullAddress = "";

        System.out.println("Building number :");
        String bNumber = input.next();

        input.nextLine(); // <enter> etkisiz hale getirmek icin

        System.out.println("Street :");
        String street = input.nextLine();
        fullAddress = bNumber+", " + street;


        System.out.println("City name and the /state name by comma and space :");
        String cityState = input.next();
        fullAddress += ", \n"+cityState;

        input.nextLine();

        System.out.println("Enter zip code:");
        String  zipcode = input.next();
        fullAddress += " " + zipcode;

        System.out.println(fullAddress);



    }
}
