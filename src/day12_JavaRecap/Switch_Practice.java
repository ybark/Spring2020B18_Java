package day12_JavaRecap;



public class Switch_Practice {
    public static void main(String[] args) {

        switch(3) {
            case(1):
                System.out.println("case 1");
                break;
            case(2):
                System.out.println("case 2");
                break;
            default:
                System.out.println("invalid case");

        }
        System.out.println("======================================");

        int statuscode = 200;
        switch (statuscode) {
            case (200):
                System.out.println("OK");
                break;
            case (201):
                System.out.println("Created");
                break;
            case(202):
                System.out.println("Accepted");
            default:
                System.out.println("Invalid  Entry");
                break;
        }


    }
}
