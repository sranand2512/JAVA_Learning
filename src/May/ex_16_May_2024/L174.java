package May.ex_16_May_2024;

public class L174 {
    public static void main(String[] args) {
        // Inheritance
        // Inherit Attributes and behaviour from parents, Grand parents


        // Super / Parent / Base class are same
        // Sub / child / Derived class are same

        // Parent -> child

        // Child extends parent{}
        // Extends keyword -> parent's attributes are available to the child class

        Programming p = new Programming(12, "KO Posan");
        Java j = new Java("lambda Expressiong");
        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12,"new");
        p1.printInfo();

        Python python = new Python();
        python.printInfo();

    }
}
