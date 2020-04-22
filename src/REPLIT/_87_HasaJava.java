package REPLIT;


import java.util.Scanner;

public class _87_HasaJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int t=word.length();
        if (t<=3) {
            System.out.println("false");
        } else {
            word=word.substring(0,5);
            word= word.toLowerCase();
            if (word.contains("java")){
                System.out.println("true");
            } else {
                System.out.println("false");}
            }
        }

    }

