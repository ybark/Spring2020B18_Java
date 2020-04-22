package REPLIT;

import java.util.Scanner;

public class _083_Party_GuestCounting_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cont = true;
        String allGuest="";

        while (cont) {
            System.out.println("Please enter guest name:");
            String gName = scan.nextLine();

            System.out.println("Do you want to enter new guest name:");
            String iscont = scan.next();
            if (iscont.equals("yes")) {
                allGuest = allGuest.concat("" + gName + ", ");
                scan.nextLine();
                cont = true;
            } else if (iscont.equals("no")) {

                allGuest = allGuest.concat("" + gName);
                cont = false;
            }
        }
        System.out.println("Guest's list: "+allGuest);


    }
}
