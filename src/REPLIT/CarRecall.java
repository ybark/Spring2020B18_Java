package REPLIT;

import java.util.Scanner;

public class CarRecall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        boolean recallModel =   (vehicleYear > 1994 && vehicleYear<1999) ||
                                (vehicleYear > 2000 && vehicleYear<2003) ||
                                (vehicleYear > 2003 && vehicleYear<2007) ||
                                (vehicleYear > 2014 && vehicleYear< 2018);
        String callMessage = "Your vehicle needs to be recall";
        String noNeedCallMessage = "Your vehicle is fine, enjoy!";

        if (recallModel) {
            System.out.println(callMessage);
        } else {
            System.out.println(noNeedCallMessage);
        }
    }
}
