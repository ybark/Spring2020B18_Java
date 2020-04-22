package day21_ArraysContinue;


import java.util.Arrays;

public class _05_MultiDimensional_Array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}};
        // indeks number    0    ,   1

        System.out.println(arr2D.length);

        int arr1[] = arr2D[0]; // 2 boyutlu dizinin ilk boyutundaki rakamlari tek boyutlu diziye aktardi
        int arr2[] = arr2D[1];// 2 boyutlu dizinin ikinci boyutundaki rakamlari tek boyutlu diziye aktardi

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int num1 = arr2D[1][3]; // 2. dizideki 7 yi verir
        System.out.println(num1);

        System.out.println("--------------");

        char[][] ch2D = {{'A', 'B'}, {'C', 'D'},  {'E','F','G'}    } ;
        // INDEX NUMBER       0 ,         1            2

        char c1 = ch2D[1][0];
        System.out.println(c1); // C

        char[] ch2 = ch2D[2];
        System.out.println(Arrays.toString(ch2));

        //////                 0, 1,  2,      0, 1,  2,     0,  1,  2,
        String[][] str2D = { {"A","B","C"}, {"D","E","F"},{"G","H","I"}       };
        //                          0              1           2



    }
}
