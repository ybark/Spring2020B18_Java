package REPLIT;

import java.util.*;
public class _122_2D_Arrays_ZombiAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }


        int control =0;

        for (int j=0;j<=10;j++) {

            for (int i=0;i<inhabitants.length;i++) {
                if (inhabitants[i] > control) {
                    control=inhabitants[i];
                }
            }


        }
        System.out.println("Day "+0+" " +Arrays.toString(inhabitants));
        for (int j=1;j<=10;j++) {

            for (int i=0;i<inhabitants.length;i++) {
                inhabitants[i]/=2;

            }
            System.out.println("Day "+j+" " +Arrays.toString(inhabitants));
            control/=2;
            if (control==0) {
                break;
            }


        }
        System.out.println("---- EXTINCT ----");

    }

}
