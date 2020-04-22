package day19_Arrays;

import java.util.Scanner;

public class _07_NameOf_10_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = new String[10];

        for (int i=1;i<11;i++) {
            System.out.println("Enter "+ i + ". name of your friend :");
            friends[i-1] = sc.next();

        }

        for (int j=1;j<11;j++) {
            System.out.println(j+". name of your friend is ==> "+friends[j-1]);
        }
    }
}
