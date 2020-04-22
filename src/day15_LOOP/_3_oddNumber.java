package day15_LOOP;

public class _3_oddNumber {
    public static void main(String[] args) {
        String resultOdd ="";
        String resultEven="";
        for (int number =1; number<101;number+=2) {
            //System.out.print(number +" ");
            resultOdd = resultOdd +number +" ";
        }
        for (int number = 2;number<=100; number +=2){
            resultEven += number + " ";
        }
        System.out.println(resultOdd);
        System.out.println (resultEven);
    }
}
