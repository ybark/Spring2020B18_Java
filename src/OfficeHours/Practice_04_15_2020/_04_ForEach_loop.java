package OfficeHours.Practice_04_15_2020;

public class _04_ForEach_loop {
    /*
        for(datatypa variablename : Arrayname) {

        }
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        for (int each:arr) {
            if (each ==3 ) {
                continue;
            }
            System.out.println(each);

        }

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        for (int each:arr2) {
            if (each % 2 == 0 ) {
                System.out.print(each +" ");
            }
        }
    }
}
