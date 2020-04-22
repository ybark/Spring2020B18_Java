package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _05_MultiDimensionalArray {
    public static void main(String[] args) {

        int[] arr1D =   {1,2,3};
        // index number  0,1,2
        //                  0,1,2    0,1,2,3
        int [][] arr2D = { {1,2,3}, {4,5,6,7} };
        // indeks number      0   ,    1

        // [index number of 1DArray] [index number of element]

        System.out.println( arr2D[1] );
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][3]); // t get 7

        System.out.println(Arrays.deepToString(arr2D));
    }
}
