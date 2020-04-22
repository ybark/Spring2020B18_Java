package REPLIT;

import java.util.Arrays;
import java.util.Scanner;

public class _122_ZombiAttack_Array_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int day = 0;
        String str = Arrays.toString(inhabitants);
        if (Arrays.equals(inhabitants, new int[8])) {
            System.out.println("Day " + day + " " + str);
            System.out.println("---- EXTINCT ----");
            System.exit(0);
        }
        System.out.println("Day " + day + " " + str);
        for (day = 1; day < 10; day++) {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] /= 2;
            /*
            inhabitants[0] /=2;
            inhabitants[1] /=2;
            inhabitants[2] /=2;
            inhabitants[3] /=2;
            inhabitants[4] /=2;
            inhabitants[5] /=2;
            inhabitants[6] /=2;
            inhabitants[7] /=2;
            */
            }
            str = Arrays.toString(inhabitants);
            if (Arrays.equals(inhabitants, new int[8])) {
                System.out.println("Day " + day + " " + str);
                System.out.println("---- EXTINCT ----");
                break;
            }
            System.out.println("Day " + day + " " + str);


        }
    }
}
