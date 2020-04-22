package REPLIT;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons :");
        int coupons = input.nextInt();
        int candy = coupons / 10;
        int gumballs =  (coupons % 10) /3;
        if (coupons>=3) {
            System.out.println("Number of Candies: "+candy);
            System.out.println("Number of Gumballs: "+gumballs);
        } else {
            System.out.println("Not enough coupons");
        }
    }
}
