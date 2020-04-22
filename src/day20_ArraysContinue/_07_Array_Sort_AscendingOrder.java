package day20_ArraysContinue;

import java.util.Arrays;

public class _07_Array_Sort_AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {1,9,2,8,3,7,4,5,7,6,0};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("First min number is :" +arr[0]);
        System.out.println("Second min number is :"+arr[1]);
        System.out.println("First max number is :"+arr[arr.length-1]);
        System.out.println("Second max number is :" + arr[arr.length-2]);

        System.out.println("-------------------------");

        char[] ch = {'Z','D','W','Y','A','B','E','D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] names = {"yucel","osman","anna","ali"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("======================");


        int[] arry = {3,1,5,-1,100,-100,200,155};

        Arrays.sort(arry);

        int[] decarry = new int[arry.length];

        int j=0;

        for (int i=arry.length-1;i>=0;i--) {
            System.out.println(i);
            System.out.println(j);
            decarry[j]=arry[i];
            j++;
        }
        System.out.println(Arrays.toString(arry));
        System.out.println(Arrays.toString(decarry));


    }

}
