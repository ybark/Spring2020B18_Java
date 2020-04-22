package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class _03_Return_Method_2 {
    // write a return method 2nd max number from int array


    public static void main(String[] args) {
        int[] arr = {100, 40, 500, 50, 30, 400, -5, -100};
        int[] arr2 = {3,6,8,9,1,2,4,90,40,50};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int lastIndexNumber = arr.length - 1;
        int secondLastindexNumber = lastIndexNumber - 1; // arr.length-2;
        int secondMaxNumber = arr[secondLastindexNumber];
        System.out.println(secondMaxNumber);

        System.out.println("=======================");

        int num2 = secondMax(arr2); // geri donen rakami degiskene atadik

        System.out.println(num2);
    }

    public static int secondMax(int arr[]) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndexNumber = arr.length - 1;
        int secondLastindexNumber = lastIndexNumber - 1; // arr.length-2;
        int secondMaxNumber = arr[secondLastindexNumber];
        // System.out.println(secondMaxNumber);


        return secondMaxNumber;
    }


}
