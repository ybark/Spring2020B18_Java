package day16_forLoop;

public class _3_CalculateSum100 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i<= 100;i++) {

        if (i %2 == 0) {
            sum += i;
        } else {
            sum2 +=i;
        }
        }
        System.out.println("  even numbers are :" + sum);
        System.out.println(" odd numbers are :" + sum2);
    }
}
