package REPLIT;

import java.util.Scanner;

public class _110_Arrays_count_EvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

      int count =0;
      for (int i=0;i<nums.length;i++) {
          if (nums[i] % 2 == 0) {
              count++;
          }

      }
        System.out.println(count);

    }
}
