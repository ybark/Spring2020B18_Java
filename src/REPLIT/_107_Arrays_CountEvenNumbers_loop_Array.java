package REPLIT;

import java.util.Arrays;
import java.util.Scanner;

public class _107_Arrays_CountEvenNumbers_loop_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count =0;
        for (int i=0;i<=nums.length-1;i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
