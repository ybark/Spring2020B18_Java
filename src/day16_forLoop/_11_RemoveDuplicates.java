package day16_forLoop;

import java.util.Scanner;

public class _11_RemoveDuplicates {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String str = sc.nextLine();

       String result ="";
       for (int i = 0; i<=str.length()-1; i++) {
           if (result.contains( ""+str.charAt(i) )) {
               continue;

           }
           result+=str.charAt(i);
       }
        System.out.println(result);
    }
}