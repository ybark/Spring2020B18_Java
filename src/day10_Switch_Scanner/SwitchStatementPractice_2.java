package day10_Switch_Scanner;

public class SwitchStatementPractice_2 {

    public static void main(String[] args) {

        // Switch şartı switch(X) parantez içerisinde bulunan değer ile case in eşit olması
        // bu değer bir değişkene atanabildiği gibi doğrudan da verilebilir.

        int num = 0;
        int val = 3;
         //switch (3) { val değişkeni ile verilen değer ile 3 aynı fark yok
        switch (val) {
            case 1:
                num  +=3;
                break;

            case 2:
                num +=2;
                break;

            case 3:
                num +=10;
                break;

            default:
                num -=5;
                break;


        }
        System.out.println(num);

    }
}
