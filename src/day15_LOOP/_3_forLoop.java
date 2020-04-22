package day15_LOOP;

public class _3_forLoop {
    public static void main(String[] args) {
        for(int i =0; i<15; i++) {
            System.out.println(i);
            System.out.println("Hello World");
        }

        for (int v=0; v<11; v+=1 ) {
            System.out.println("Hello Word");
            System.out.println(v);
            for (int i=1; i<11; i++) {
                System.out.println(i +":" + i*i);
            }

        }
    }

}
