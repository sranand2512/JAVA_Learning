package May.ex_04_May_2024;

public class L135_max_salaries {
    public static void main(String[] args) {
        // arrays
        // collection of similar data types

        // find the max in arrays

        int[] salaries = {55,66,96,55,23,99,85,100,520,900};
        // how to we find the max.
        // Logic - > max = 0, for i--0 to length
        //salaries[i] max -> max -...0 to l - max

        int max_salary = Integer.MIN_VALUE;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i]> max_salary){
                max_salary = salaries[i];
            }

        }
//        int j =0;
//        while(j < salaries.length){
//            if(salaries[j]>max_salary){
//                max_salary = salaries[j];
//            }
//            j++;
//        }

        System.out.println(max_salary);

    }

}
