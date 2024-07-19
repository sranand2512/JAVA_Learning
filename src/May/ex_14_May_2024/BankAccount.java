package May.ex_14_May_2024;

public class BankAccount {        // PM Constructor
    BankAccount(String bankName, int balance, String ifscCode) {
        this.bankName = bankName;
        this.balance = balance;
        this.ifscCode = ifscCode;
    }

    BankAccount(String bankName,String ifscCode) {       // PM Constructor (with 2 parameter )
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }


    String bankName;
    int balance;
    String ifscCode;

    BankAccount(){                // Default Constructor
        bankName= "SBI";
        ifscCode= "SBIN001";
        balance= 20;

    }
    void printDetails(){
        System.out.println("Bank name - "+ bankName);
        System.out.println("Ifsc Cose -"+ ifscCode);
        System.out.println("Balance  -"+ balance);
    }

}
