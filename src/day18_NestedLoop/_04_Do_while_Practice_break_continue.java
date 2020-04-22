package day18_NestedLoop;

public class _04_Do_while_Practice_break_continue {
    public static void main(String[] args) {

        int num =0;
        do {
            if (num%2 == 0) {
                System.out.print(num + " ");

            }
            num++;
        } while(num<=100);

        System.out.println(" ======================");

        int i=1;
        do {
            System.out.println(i);
            i++;
        } while(i<=5);

        System.out.println("=======================");

        int z=1;
        do{
            System.out.println(z);
            if (z==2) {
                break;
            }
            z++;
        } while(z<=5);


        System.out.println("===========================");
        int y=1;
        do{
            if (y==3) {
                y++; continue;
            }
            System.out.print(y);
            y++;
        }while(y<=5);

        System.out.println();
        System.out.println("==================================");


        int t = 1;

        do {
            if (t%2 !=0) {
                t++;
                continue;
            }
            System.out.print(t+" ");
            t++;

        } while (t<=100);
    }
}
