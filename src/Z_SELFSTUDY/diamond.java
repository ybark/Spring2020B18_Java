package Z_SELFSTUDY;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        if (userInput % 2 == 0) {
            userInput++;
        }
        String result1 = "";
        String result2 = "";
        String result = "";
        int middle = 0;
        int count = 0;
        int a = 0;
        for (int i = 0; i < userInput; i++){
            for (int j = 0; j < userInput/2; j++){
                if (middle > j){
                    result1 += "*";
                }else{
                    result2 += " ";
                }
            }
            result += result2+result1+"*"+result1+result2+"\n";
            if (i < userInput/2){
                middle++;
            }else{
                middle--;
            }
            result1 = "";
            result2 = "";
        }
        System.out.println(result);
    }
}