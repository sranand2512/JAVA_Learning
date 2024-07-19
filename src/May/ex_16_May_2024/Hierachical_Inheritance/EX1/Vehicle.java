package May.ex_16_May_2024.Hierachical_Inheritance.EX1;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }
    void TopSpeed(){
        System.out.println("Yeah from"+getClass().getSimpleName());
    }

}
