package REPLIT;

import java.util.Scanner;

public class _064_MiddleString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();

            boolean even = word1.length() %2 == 0;
            boolean odd = word1.length() %2 !=0;
            int totalchar = word1.length();

            if (totalchar==1) {
                System.out.println(word1+word1+word1);

            } else if (totalchar==2) {
                System.out.println(word1+word1);

            } else if (odd && totalchar >=3) {
                int a= totalchar/2;
                System.out.println(word1.charAt(a));
            } else if (even) {
                int b = totalchar/2;
                System.out.println(""+word1.charAt(b-1)+word1.charAt(b));
            }


        }

    }
