package Z_SELFSTUDY;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        String[][] arr= { {"A","B","C"}, {"D","E"} };
        //                      0               1
        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length; j++) {
                System.out.println(i + "  " + j);
                System.out.println(arr[i][j]);
                if(arr[i][j].equals("B")) {
                    break;
                }

                System.out.print(arr[i][j]);
            }
        }
    }
}
