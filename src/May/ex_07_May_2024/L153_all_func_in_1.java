package May.ex_07_May_2024;

public class L153_all_func_in_1 {
    public static void main(String[] args) {

        // Non-return with no parameter
        nrnp();

        //Non-return with parameter
        nrwp("Saurabh");

        //Return with no parameter
        rwnp(3,6);

        //Return with parameter
       int b = rwp(6,6);
        System.out.println(b);

    }
    static void nrnp(){
        System.out.println("hello");
    }
    static void nrwp(String a){
        System.out.println("Hi "+ a);
    }

    static void rwnp(int a, int b){
        System.out.println(a+b);
    }

    static int rwp (int a, int b){
        return a+b;
    }
}
