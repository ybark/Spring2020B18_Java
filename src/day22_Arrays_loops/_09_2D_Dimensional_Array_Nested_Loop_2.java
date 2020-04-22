package day22_Arrays_loops;

import java.util.Arrays;

public class _09_2D_Dimensional_Array_Nested_Loop_2 {
    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7,}, {6}, {5, 4, 3, 2, 1, 0}};
/*                      j
                numbers[0] ==>{9, 8, 7}         numbers[0][i]  i needs to be repeated three times
                numbers[1] ==> {6}              numbers[1][i]  i needs to be repeated one times
                numbers[2] ==>  {5,4,3,2,1,0}   number[2][i] i needs to be repeated 6 times
         */

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                System.out.println(numbers[j][i]);
            }
            System.out.println("----------------");
        }

        for (int k=0; k<numbers.length; k++) {
            for (int i=numbers[k].length-1; i>=0;i--) {
                System.out.print(numbers[k][i]+" ");

            }
        }
        System.out.println();
        System.out.println("----------------");

        for (int k=numbers.length-1; k>=0; k--){
            for (int i=0; i<=numbers[k].length-1;i++) {
                System.out.print( numbers[k][i] +" ");
            }

        }
        System.out.println();
        System.out.println("-----------------");

        for (int k=numbers.length-1; k>=0;k--) {
            for (int i=numbers[k].length-1;i>=0;i--) {
                System.out.print(numbers[k][i] +" ");
            }

        }


    }
}
