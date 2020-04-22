package day26_MethodOverloading;

import java.util.Arrays;

public class _04_Overloading_2 {


    /*
    first method : Print the sum of 2 numbers
      second method : Print the sum of 3 numbers
        third method : Print the sum of 4 numbers
     */
    public static void main(String[] args) {
        sum2numbers(10,5);
        sum3numbers(10,5,15);
        sum4numbers(10,20,30,5);

        System.out.println("========================================");
        sum(10,5);
        sum(10,15,5);
        sum(10,20,30,5);
        int[] arr1 = {3,2,1};

        char[] arr2 = {'z', 's', 'a'};

        double[] arr3 = {7.4, 6,5, 20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3); // same method name, different parameter


    }


    public static void sum2numbers(int a, int b) {

        System.out.println(a+b);
    }
    public static void sum3numbers(int a, int b, int c) {

        System.out.println(a+b+c);
    }
    public static void sum4numbers(int a, int b, int c, int d) {

        System.out.println(a+b+c+d);
    }
    //===============================================================

    public static void sum (int a, int b) {
        System.out.println(a+b);
    }

    public static void sum (int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void sum (int a, int b,int c, int d) {
        System.out.println(a+b+c+d);
    }

}