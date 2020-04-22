package day18_NestedLoop;

public class _07_NestedLoop_2 {

    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */

    public static void main(String[] args) {

        for (int j=1;j<=9;j++) {

            for (int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int j=9;j>=0;j--) {

            for (int i=j;i>=0;i--){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("====================");

        for (char z='a';z<='z';z++) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        for (char z='z';z>='a';z--) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}
