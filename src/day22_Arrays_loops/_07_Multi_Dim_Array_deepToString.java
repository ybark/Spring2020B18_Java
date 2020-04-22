package day22_Arrays_loops;

import java.util.Arrays;

public class _07_Multi_Dim_Array_deepToString {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3};

        int[][] arr2D = {{1, 2, 3}, {4,5,6}};
        //  index number    0           2

        int arrD1[] = arr2D[0];

        System.out.println(Arrays.toString(arrD1));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[0][2]); // single element so no need to apply Arrays.toString
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));

        for (int eachElement:arr2D[0]) {
            System.out.println(eachElement);
        }
        System.out.println("--------------------");

        for (int i=0;i<=arr2D[0].length-1;i++) {
            int num =arr2D[0][i];
            System.out.println(num);
        }
    }
}
