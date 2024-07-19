package May.ex_04_May_2024;

import java.util.Scanner;

public class L144_palindrome {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string for checking the palindrom: ");

        String user_input = sc.nextLine();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if (user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
