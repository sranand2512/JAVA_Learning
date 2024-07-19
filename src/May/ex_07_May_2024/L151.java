package May.ex_07_May_2024;

public class L151 {
    public static void main(String[] args) {

        int r1 = sum_two(45,86);
        System.out.println(r1);

        int r2 = sum_two(5,9);
        System.out.println(r2);

        String r3 = sum_two("Saurabh", 56);
        System.out.println(r3);

    }
    static int sum_two(int a, int b){
        return a + b;
    }
    static String sum_two(String a, int b){
        return a + b;
    }
}
