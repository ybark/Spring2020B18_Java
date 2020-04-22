package day17_While_Loops;

public class _12_RemoveDublicate_IgnoreCaseSensitivity {
    public static void main(String[] args) {
        String str = "Cybertek School is a grest place to study".toLowerCase();
        int count = 0;
        String word = "S".toLowerCase();
        while (str.contains(word)){
            count++;
            str= str.replaceFirst(word,""); // after first counting the java we hav to remove from the str

        }
        System.out.println(count);
    }
}
