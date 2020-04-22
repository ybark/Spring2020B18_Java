package OfficeHours.Practice_04_08_2020;

public class _03_WhileLoop_Practice {
    public static void main(String[] args) {
        /*
        while(contion) {
        statement
        }
        if ile olan farki if de sadece 1 defa gerceklesir bunda ise sonsuz defa execute eder.
         */

        for (int i=0; i<0;i++) {
            System.out.println("Hello World");
        }

        System.out.println("=====================");

        int z=0;
        while (z<5) {
            System.out.println("Hello Cybertek");
            z++;
        }

        System.out.println("============EVEN ODD NUMBERS============");

        int num=0;
        while (num <=100 ) {
            if (num % 15 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }



    }
}
