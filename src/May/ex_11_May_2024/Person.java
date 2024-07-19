package May.ex_11_May_2024;

public class Person {
    // Attribute

    String name;
    byte age;
    long phoneNumber;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eyeColor;


    // Functionality / Behaviour
    void walk() {
        System.out.println("I can walk");
    }

    void talk(String msg) {
        System.out.println("hello" + msg);
    }

    String sleep() {
        return "sleeping";
    }

    String eat(String item) {
        return item;
    }
}


