package May.ex_07_May_2024;

import java.util.Scanner;

public class L154_calc_using_func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num 2");
        int num2 = sc.nextInt();

        int sum= sum1(num1,num2);
        int sub= sub1(num1,num2);
        int mul= mul1(num1,num2);
        int div= div1(num1,num2);
        int mod= mod1(num1,num2);


        System.out.println("Sum = "+sum);
        System.out.println("Sub = "+sub);
        System.out.println("Mul = "+mul);
        System.out.println("Div = "+div);
        System.out.println("Mod = "+mod);


    }
    static int sum1(int a, int b){
        return a+b;

    }
    static int sub1(int a, int b) {
        return a - b;
    }
    static int mul1(int a, int b) {
        return a * b;
    }
    static int div1(int a, int b) {
        return a / b;
    }
    static int mod1(int a, int b) {
        return a % b;

    }
    }
