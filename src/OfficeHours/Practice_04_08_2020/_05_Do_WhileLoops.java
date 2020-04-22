package OfficeHours.Practice_04_08_2020;

public class _05_Do_WhileLoops {
    public static void main(String[] args) {

        boolean b = false;

        while (b) {
            System.out.println(" hello World");
        }
        System.out.println("-------------------------");


        do {
            System.out.println("Hello World");
        } while(b);
        // do - while dongusunde  condition false bile olsa 1 defa calisir.
        // While de ise sart olusmadan calismaz.

        System.out.println("=================================");

        int j=0;
        do{
            if ( j % 15 ==0) {
                System.out.print(j + " ");
            }


            j++;
        }while(j<=100);

    }
}
