package day22_Arrays_loops;


import java.util.Arrays;

public class _12_Nested_For_Each_Loop_2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3,},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 17, 18, 19, 20, 21}};

        // print all the even numbers
        // count the all odd numbers
        // sum of even numbers
        // sum of odd numbers
        int sumOfEven=0;
        int sumOfOdd=0;
        int countOfOddNumbers=0;
        int countOfEvenNumbers =0;

        for (int[] each1DArray:numbers) {
            for (int eachElement:each1DArray){
                if (eachElement % 2 == 0){
                    System.out.print(eachElement+" ");
                    sumOfEven+=eachElement;
                    countOfEvenNumbers++;
                } else {
                    sumOfOdd+=eachElement;
                    countOfOddNumbers++;
                }

            }


        }
        System.out.println("\n");

        System.out.println("Count of Even numbers: "+countOfEvenNumbers);
        System.out.println("Sum of Even numbers: "+sumOfEven);
        System.out.println("Count of Odd numbers: "+countOfOddNumbers);
        System.out.println("Sum of Odd numbers: "+sumOfOdd);


    }


}
