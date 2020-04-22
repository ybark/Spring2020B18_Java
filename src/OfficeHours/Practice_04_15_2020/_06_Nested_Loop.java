package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _06_Nested_Loop {

    public static void main(String[] args) {

        char[][] arr2D = { {'A','B',}, {'C','D','E'}, {'F','J','H'} };
        // INDEK NUMBER        0             1              2


        for (int j=0; j<arr2D.length;j++) {
            for (int i = 0; i < arr2D[j].length; i++) {

                System.out.print(arr2D[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for (char[] each1D:arr2D) {

            System.out.println(Arrays.toString(each1D)); // dizinin tamamini yaziyor
            for (char eachElement:each1D) {
                System.out.print(eachElement+" "); // tek tek elementleri yaziyor
            }
            System.out.println();
            System.out.println("------------");

        }


    }


}
