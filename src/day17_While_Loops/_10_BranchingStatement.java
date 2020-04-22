package day17_While_Loops;

public class _10_BranchingStatement {
    public static void main(String[] args) {
        // System.exit(0) programi tamamen durduruyor.

        for (int i=1; i<5;i++) {
            if (i %2 !=0) {
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("test completed");
    }
}
