package day20_ArraysContinue;

import java.util.Arrays;

public class _05_ArrayUtilities {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        String r = Arrays.toString(arr);

        System.out.println(r);
        System.out.println("-------------------------");

        String name[] = {"Madina","ahmet","omer","yucel"};
        System.out.println(Arrays.toString(name));

        double[] num = {10,20,30,40,50};
        System.out.println(Arrays.toString(num));
        System.out.println(num[0] + 1);
    }
}
