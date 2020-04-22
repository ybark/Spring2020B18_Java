package day16_forLoop;

/*
1 den 5 e kadar dongu sagla ama 3 te dursun
 */
public class _7_Break_Statement {
    public static void main(String[] args) {
        int i = 0;
        char ch = ' ';
        for (i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i);
        }
        for (int j = i; j >= 0; j--) {
            if (j == 2) {
                break;
            }
            System.out.print(" " + j);
        }
        for (ch='A'; ch<='Z';ch ++) {
            System.out.print(ch);
            if (ch=='M'){
                System.out.print(" ");break;
            }
        }
        for (char ch2=ch;ch2>='A'; ch2--) {
            System.out.print(ch2);
        }
    }
}

