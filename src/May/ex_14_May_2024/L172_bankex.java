package May.ex_14_May_2024;

public class L172_bankex {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        System.out.println("\n");

        BankAccount hdfc = new BankAccount("HDFC", 520,"HDFC001");
        hdfc.printDetails();

        System.out.println("\n");

        BankAccount icici = new BankAccount("ICICI", 520,"ICICI001");
        icici.printDetails();

        System.out.println("\n");

        BankAccount yesbank = new BankAccount("Yes Bank","YESB001");
        yesbank.printDetails();


    }
}
