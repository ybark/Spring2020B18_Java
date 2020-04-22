package day16_forLoop;

/*
Skip Y U C E L

 */
public class _10_ContinuePractice {
    public static void main(String[] args) {

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if(ch=='Y' || ch=='U' || ch == 'C' || ch == 'E' || ch=='L') {
                continue;
            }
            System.out.print(ch+" ");

        }
    }
}
