package day17_While_Loops;

public class _07_While_loopPractice_2 {
    public static void main(String[] args) {

        int i=0;
        int sum =0;
        while (i<=10) {
            if (i %2 ==0) {
                System.out.println(i);
                sum+=i;
            }

            i++;
        }
        System.out.println("total of even number is : " +sum);
    }
}
