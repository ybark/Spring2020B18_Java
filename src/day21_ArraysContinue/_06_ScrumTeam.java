package day21_ArraysContinue;



public class _06_ScrumTeam {
    public static void main(String[] args) {

        //                      0       1           2       3
        String[] DevTeam = {"zeynep", "Haydar", "Cavid", "muhtar"};
        String[] Testers = {"Rahman", "Ozgur", "Osman", "Ali"};
        String [] PO =     {"Yucel","Ahsen"};


        String[][] ScrumTeam = {DevTeam, Testers,PO};
        //                        0     ,  1,     2

        ScrumTeam[0][3] = "Jean";
        System.out.println(ScrumTeam[0][3]);

        String info = ScrumTeam[1][2];
        System.out.println(info);

        System.out.println("===========================");

        for (String eachEmployee : ScrumTeam[2]) {  /// developer team tamamini verir indek numarasi 0 olan
            System.out.println(eachEmployee);

        }
        System.out.println("-------------");
        System.out.println(ScrumTeam[2][1]);


    }
}

