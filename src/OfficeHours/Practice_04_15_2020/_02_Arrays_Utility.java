package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class _02_Arrays_Utility {

    /*
        Arrays.sort() sort array in ascending order
        Arrays.equal() checks two arrays are they equal or not.
        Arrays.toString() // converts single dimen  array to String
        Arrays.deepToString() converts 2 dim array to string


     */

    public static void main(String[] args) {

        int[] arr = {9,10,8,65,8,6,5};


        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // write the programm defining min and maz salaries

        int[] sallaries = {10000,30000,12000,5000,34000,2000,};
        int lenght = sallaries.length;
        int lastIndexNumber = lenght-1;
        Arrays.sort(sallaries);

        System.out.println(Arrays.toString(sallaries));
        System.out.println("min salary is :" + sallaries[0]);
        System.out.println("max salary is :" + sallaries[lastIndexNumber]);

        System.out.println("-------------------");
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println(Arrays.equals(arr1,arr2)); // element of the arrays also must be in a same sort

        int[] arr3 = {1,2,3};
        int[] arr4 = {3,1,2};

        System.out.println(Arrays.equals(arr3,arr4));

        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4));


    }
}
