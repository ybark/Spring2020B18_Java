package REPLIT;

import java.util.Scanner;

public class _086_Cata_Dogs_Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int countOfDog = 0;
        int countOfCat = 0;


        boolean stop = true;

        while (stop) {
            if (word.contains("dog")) {
                countOfDog++;
                word = word.replaceFirst("dog", "");

            } else stop = false;


        } stop= true;

        while (stop) {
            if (word.contains("cat")) {
                countOfCat++;
                word = word.replaceFirst("cat", "");

            } else stop = false;

        }
        if(countOfCat==countOfDog) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    }

