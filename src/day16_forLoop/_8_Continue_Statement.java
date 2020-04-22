package day16_forLoop;

public class _8_Continue_Statement {
    public static void main(String[] args) {
        String str = "YUCEL";
        char ch1 = ' ';
        String  ch="";
        for (ch1='A'; ch1<='Z'; ch1++) {
            //if (ch1 =='D' || ch1 == 'I' || ch1 =='L' || ch1 =='E' || ch1 =='K') {
                System.out.print(" ");
              //  continue;
            ch=""+ch1;
            if (str.contains(ch)){
                System.out.print("*");
                continue;
            }
            System.out.print(ch1);
        }
        System.out.println();
        for (ch1 = 'Z'; ch1>='A';ch1-- ) {
            ch=""+ch1;
            if (str.contains(ch)){
                System.out.print(""+ch1);
                continue;

            }
        }

    }
}
