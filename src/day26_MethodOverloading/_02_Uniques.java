package day26_MethodOverloading;

public class _02_Uniques {

    public static void main(String[] args) {
        String str = "ABBBDB";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }

        }

        System.out.println(result);

        String str2 = "Cybertek";
        String result2 = unique(str2);
        System.out.println(result2);
    }


    public static String unique (String str) {

        String result ="";
        for (int i = 0; i < str.length(); i++) {

            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static int frequency (String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }

        return count;
    }
}
