package day22_Arrays_loops;
//3. write a program that can return the number of appearances
// of "java" and "python" anywhere in the sentence

public class _05_Java_Python {
    public static void main(String[] args) {
        String sentence = "I like java and javascript";
        int countJava =0;
        String[] words = sentence.split(" "); // I, like, java, javascript

        for ( String each:words) {
            if(each.contains("java")) {
                countJava++;
            }
        }
        System.out.println(countJava);
    }

}
