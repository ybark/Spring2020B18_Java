package day12_JavaRecap;


public class QuizReview {
    public static void main(String[] args) {

        boolean result = true;
        int N = 100;

        if(result) {
            N/=10;    // n= n/10 ==> n=100/10 = n=10
            result = !result; // result true idi simdi bu komut ile false oldu
                            // result = false

        }

        if (result) {
            N*=2;
            } else {
            N-=5; // yani n=10 idi simdi n=n-5 == n=10-5 n=5

        }
        System.out.println(N);
        System.out.println(true == true!=false);

    }
}
