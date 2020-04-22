package REPLIT;

import java.util.Scanner;

public class _080_OnlineBook {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("are you premium customer true /false :");
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();


        if(isPremiumCustomer) {
            if (nbooksPurchased >= 5 && nbooksPurchased < 8){
                freeBooks = nbooksPurchased =1;
                } else if ( nbooksPurchased>= 8) {
                    freeBooks=(nbooksPurchased / 8)*2;
                    }
        } else if (nbooksPurchased >=7 && nbooksPurchased<12) {
            freeBooks = 1;

        } else if (nbooksPurchased>= 12) {
            freeBooks=(nbooksPurchased/12)*2;
        }
        System.out.println("free books :" +freeBooks);






    }

}
