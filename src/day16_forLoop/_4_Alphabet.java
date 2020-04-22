package day16_forLoop;

public class _4_Alphabet {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <='Z'; ch++) {
            System.out.print(ch+" ");
        }
        System.out.println();
        for(char ch = 'Z'; ch>= 'A'; ch -- ) {
            System.out.print(ch + " ");
        }
    }

}
