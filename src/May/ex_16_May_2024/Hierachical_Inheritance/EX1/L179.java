package May.ex_16_May_2024.Hierachical_Inheritance.EX1;

public class L179 {
    public static void main(String[] args) {
        Car c = new Car();
        c.TopSpeed();

        Vehicle v = new Car(); // Dynamic dispatch
        v.TopSpeed();

    }
}
