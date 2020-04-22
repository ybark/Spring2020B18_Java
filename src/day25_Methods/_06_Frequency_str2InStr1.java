package day25_Methods;

public class _06_Frequency_str2InStr1 {

    public static void main(String[] args) {
        String str1 = "javajavajavajavajavajavajava";
        String str2 = "java";
        int result = frequncy_str2_in_str1(str1,str2);
        System.out.println(result);

    }

    public static int frequncy_str2_in_str1 (String str1,String str2) {
        int count =0;
        while (str1.contains(str2)) {
            count++;
            str1=str1.replaceFirst(str2,"");

        }
        return count;
    }
}
