package day21_ArraysContinue;

import java.util.Arrays;

public class _03_for_each_loop_Reverse_Sentence {

    public static void main(String[] args) {
        int[] num = {1,2,3,4};

        for (int eachElement:num) {
            System.out.println(eachElement);
        }

        System.out.println("-----------------");

        String[] student = {"ali","veli","selami"};

        for (String eachStudent:student) {
            System.out.println(eachStudent);
        }

        System.out.println("-----------------");

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int each:arr1) {
            if (each <5) {
                continue;
            }
            System.out.println(each);
        }

        System.out.println("---------------------");

        String sentences = "I like java"; // reverse the sentences Java like I

        String [] words = sentences.split(" ");
        for (String each:words) {
            System.out.println(each);
        }

        System.out.println(Arrays.toString(words));

        System.out.println("-------------------");

        for (int i=words.length-1;i>=0;i--) {
            System.out.println(words[i]);
        }


    }


}
