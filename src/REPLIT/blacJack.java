package REPLIT;

import java.util.Scanner;

public class blacJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();
        int total = house + player;

        if(total > 21) {
            System.out.println("bust");
        } else if( total<21 && house > player) {
            System.out.println("player loss");
        } else if (total<21 && player == house) {
            System.out.println("its a tie");
        } else if (total<21 && player>house) {
            System.out.println("player wins");
        }
    }
}
