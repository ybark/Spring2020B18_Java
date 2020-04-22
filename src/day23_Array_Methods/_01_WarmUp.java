package day23_Array_Methods;

/*
warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop

 */
public class _01_WarmUp {
    public static void main(String[] args) {

        String [] arr = {"A",  "B", "A", "C"};

        int count =0;

        System.out.println("--------------1st solution -----------");
        for (String each2:arr) {


            for (String each : arr) {


                if (each.equals(each2)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }
            count=0;


        }

        System.out.println("-------------2nd solution -----------");
        for (int j=0; j<arr.length;j++) {

            for (int i=0;i<arr.length;i++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println(arr[j]);
            }
            count =0;
        }





    }
}
