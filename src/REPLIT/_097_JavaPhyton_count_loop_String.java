package REPLIT;

import java.util.Arrays;
import java.util.Scanner;

public class _097_JavaPhyton_count_loop_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean stop = true;
        int countJava=0;
        int countPython =0;

        /*        while (stop) {
                    if( str.contains("java")) {
                        str=str.replaceFirst("java","");
                        countJava++;continue;
                    } else if (str.contains("python")) {
                        str=str.replaceFirst("python","");
                        countPython++;continue;
                    }

                    stop=false;
                    }

        if ((countPython>0 || countJava>0) && (countJava == countPython)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */
        String[] arr = str.split(" ");
        int javacount =0;
        int pythoncount=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].contains("java")) {
            javacount++;
            } else if (arr[i].contains("python")) {
                pythoncount++;
            }
        }
        if (javacount==pythoncount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
