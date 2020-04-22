package REPLIT;

import java.util.Scanner;

public class _084_ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitance = scan.nextInt();

        int j= inhabitance;
        if (inhabitance>0) {
            for (int i = 0; i <= j; i++) {

                System.out.println("Day " + i + " [" + inhabitance + "]");
                inhabitance = inhabitance / 2;
                if (inhabitance <= 0) {
                    break;
                }
            }
        }
        System.out.println("---- EXTINCT ----");
    }
}
