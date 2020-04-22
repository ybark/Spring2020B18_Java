package day15_LOOP;


import java.util.Scanner;

public class _5_Palindrom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        String newword="";
        int maxIndexNumber=word.length()-1;

        for (int i=maxIndexNumber;i>=0;i--){
            newword=newword+word.charAt(i);

        }

        System.out.println(newword.equals(word));
    }
}
