package day20_ArraysContinue;

import java.util.Arrays;

public class _06_Task_combine2Arrays {
    public static void main(String[] args) {

        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6,7};
        int[] num3 = new int [num1.length + num2.length];


        int counter = 0;

        for (int i=0;i<= num1.length-1;i++) {
            num3[i] = num1[i];
            counter++;
        }


        for (int j=0;j<=num2.length-1;j++) {
            num3[counter]=num2[j];
            counter++;
}


        System.out.println(Arrays.toString(num3));



    }
}
