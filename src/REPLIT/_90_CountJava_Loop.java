package REPLIT;

import java.util.Scanner;

public class _90_CountJava_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String newWord = "";
        int count =0;
        boolean stop = true;
        while (stop) {
        if (word.contains("java")) {
            word=word.replaceFirst("java", " ");
            count++; continue;
        }
        stop=false;
        }
        System.out.println(count);



    }
}
