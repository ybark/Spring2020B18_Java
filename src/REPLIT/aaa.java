package REPLIT;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        if (model.equals("Extravagant")) {
            if (year>=2010 && year<=2012) {
                recalled = true;
            }
        } else if (model.equals("Guzzler")) {
            if (year>=2015 && year<=2018) {
                recalled = true;
            }
        }

        System.out.println(recalled);


    }
}
