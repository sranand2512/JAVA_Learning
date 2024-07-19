package Z_homework;

import java.util.Scanner;

public class h4_double_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[5];

        System.out.println("Enter the array of 5 :");
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4] = sc.nextInt();

        int [] array2 = new int [5];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i]*2;

        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("New arrays are: "+array2[i]);

        }

    }
}
