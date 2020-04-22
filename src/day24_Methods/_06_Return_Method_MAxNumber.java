package day24_Methods;

import java.util.Arrays;

public class _06_Return_Method_MAxNumber {

    public static void main(String[] args) {
    int [] arr = {9,8,7,100,200,50,40};

    int max = MaxNumber(arr); // diziyi maxnumber methoduna yolladik.
        System.out.println(max);

        int min = MinNumber(arr);  // diziyi min number metodona yolladik ve donusunde de min degiske ine atatik


        System.out.println(min);


    }



    public static int MaxNumber (int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1]; // siralayip dizi icerisinden max number bulup geri donderdik

    }

    public static int MinNumber (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }




}
