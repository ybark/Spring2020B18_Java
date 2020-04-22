package REPLIT;

import java.util.Scanner;

public class _115_Arrays_Max_length_intheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] words = new String[5];



        for (int i=0;i<5;i++) {
            words[i] = sc.nextLine();
        }

        int a=0;
        String  longest=words[0];
        for (int i=0;i<5;i++) {
            if (words[i].length()>longest.length()) {
                longest.equals(words[i]);
                a=i;

            }
        }
        System.out.println(words[a]);

    }
}
