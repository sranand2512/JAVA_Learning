package Z_homework;

import java.util.Scanner;

public class h4_array_print_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];

        System.out.println("Enter the marks of 5 subject respectively:");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();


        for (int i = 0; i < marks.length; i++) {
            System.out.println("All marks are :"+ marks[i]);

        }
    }
}
