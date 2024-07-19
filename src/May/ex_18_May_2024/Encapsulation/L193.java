package May.ex_18_May_2024.Encapsulation;

public class L193 {
    public static void main(String[] args) {

        ICICBank cus1 = new ICICBank("saurabh", 5000);
        System.out.println(cus1.getBal());

        cus1.setBal(-5622);
        System.out.println(cus1.getBal());

    }
}
