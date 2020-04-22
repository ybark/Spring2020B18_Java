package day09_NestedIf_Ternary;
/*
age groups are
Teenager <21
adult >=21 && <55
Senior >55

Age cannot be negative or greater than 150

 */
public class ageGroups_NestedIf {
    public static void main(String[] args) {

int age =56;
String ageGroub ="";
if (age>=0 && age<=150) {
    if (age<21) {
        ageGroub="Teenager";
    } else if (age>=21 && age<55){
        ageGroub ="adult";
    } else {
        ageGroub = "Senior";
    }
    System.out.println(ageGroub);
} else
    System.out.println("invalid entry");
    int age2=450;
    String ageGroub2="";
    if (age2 >=0 && age2<=150) {
        ageGroub2 = (age2<21) ? "teenagerr" : (age2>=21 && age2<55) ? "adultt" : "Seniorr";
        System.out.println(ageGroub2);
    } else {
        System.out.println("invalid entry2");
    }

    }
}
