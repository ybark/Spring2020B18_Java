package day21_ArraysContinue;

import java.util.Arrays;

public class _09_3DimenArray {
    public static void main(String[] args) {

        int[] arrA1d = {0, 1, 2, 3};
        int[] arrB1d = {4, 5, 6, 7};

        int arrA2d[][] = {arrA1d, arrB1d};

        //          2 d Array { 0 }, {  1   } ,{     0      }, {     1      }
        int[][][] arrA3d = {{arrA1d, arrB1d}, {{8, 9, 10, 11}, {12, 13, 14, 15}}};

        //           3d Array   {       0        } , {            1             }

        System.out.println(Arrays.deepToString(arrA3d));        // 3 boyutlu dizinin tamamini yazdirdi

        System.out.println(Arrays.deepToString(arrA3d[1]) );    // 3 boyutlu dizinin 2. 2 boyutlu dizi kismini yazdirdi

        System.out.println(Arrays.deepToString(arrA2d)  );      // 2 boyutlu dizinin tamamini yazdirdi

        System.out.println(Arrays.toString(arrA2d[0]));         // 2 boyutlu dizinin ilk tek boyutlu tarafini tamamen yazdirdi

        System.out.println(Arrays.toString(arrA1d));            // arrA1D tek boyutlu dizinin tamamini yazdirdi

        System.out.println(Arrays.toString(arrA3d[1][1])  );    // 3 boyutlu dizinin 2. boyutunda boyutunda bulunan 2. tek boyutlu dizinin tamamini yazdirdi.

        System.out.println(arrA3d[1][0][3]);                    // 3 boyutlu dizinin 2. boyutundaki tek boyutlu dizinin 3. elemani olan 11 yazdirdi





    }

}

