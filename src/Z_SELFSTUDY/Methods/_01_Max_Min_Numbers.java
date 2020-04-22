package Z_SELFSTUDY.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Max_Min_Numbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers do you want to entry Min 3 numbers :");
        int define= sc.nextInt();
        if (define<3) {
            System.exit(0);
        }

        int[] numbers = new int[define];

        for (int i=0;i<define;i++) {
             int num = sc.nextInt();
            numbers[i]=num;
        }

        System.out.println("Your Array is : ");
        System.out.println(Arrays.toString(numbers));

        System.out.println();
        minNumber(numbers);
        maxNumber(numbers);
        DescendingOrder(numbers);

    }



    public static void maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("minimum number is :" + numbers[0]);

    }
    public static void minNumber (int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Maximum number is :" + numbers[numbers.length-1]);


    }

    public static void DescendingOrder (int[] numbers) {
        Arrays.sort(numbers);
        int[] revArr = new int[numbers.length];
        int j=numbers.length-1;
            for (int i=0;i<=numbers.length-1;i++) {
                revArr[i]=numbers[j];
                j--;


            }

        System.out.println("your array's descending order is \n" + Arrays.toString(revArr));


    }
}
