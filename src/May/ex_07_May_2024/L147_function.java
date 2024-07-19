package May.ex_07_May_2024;

import java.sql.SQLOutput;

public class L147_function {
    public static void main(String[] args) {

        /*
         methods - when we use them in class then it is method else it is a function
         Two type of function
         Which return something
         which do not return anything - void return
         Define the function ->definition -> call
        */
        say_something(); // calling
        System.out.println("End");

    }
    static void say_something(){ // Definition
        System.out.println("Hello, how are you");
    }
}
