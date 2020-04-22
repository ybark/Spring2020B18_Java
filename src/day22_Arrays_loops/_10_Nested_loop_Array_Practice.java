package day22_Arrays_loops;

public class _10_Nested_loop_Array_Practice {
    public static void main(String[] args) {
        int[][] numbers = { {1,2,3,},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,17,18,19,20,21}};

        // print all the even numbers
        // count the all odd numbers
        int count=0;

        for (int k=0;k<=numbers.length-1;k++) {
            for (int i=0;i<=numbers[k].length-1;i++) {
                if (numbers[k][i] %2 == 0) {
                    System.out.print(numbers[k][i]+" ");
                } else {count++;}
            }
        }
        System.out.println();
        System.out.println(count);



    }
}
