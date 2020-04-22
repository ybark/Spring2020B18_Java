package day19_Arrays;

public class _03_Frequency {
    public static void main(String[] args) {
        String str = "AABdddffghhkkllbbCC"; // A2B1C2
        String result =""; // A2B1C2
        String nonDub =""; //ABC


        for (int i=0;i<=str.length()-1;i++) {
            if (! nonDub.contains(""+str.charAt(i))) { //if the caharacter at index i is not contained in nondub it will concated to nondub
                nonDub+=str.charAt(i);
            }
        }
       // System.out.println(nonDub);

        for (int j=0;j<=nonDub.length()-1;j++) {
            char ch = nonDub.charAt(j);


            int count = 0; // count the total number of occurance of each character from str
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result += "" + ch + count;
        }

        System.out.println(result);
    }
}
