package May.ex_18_May_2024.ThisandSuper;

public class L181_super {
    public static void main(String[] args) {
        //Super keyword in java
        //Parent - child relation is called single inheritance
        // Super keyword reference to parent
        // Variable of parent
        // Method of parent
        // Constructor of the parent.

        Car c = new Car();
        c.display();


    }
}
class Car extends Vehicle{
    int maxSpeed = 180;
    void display(){
        System.out.println("max speed of Vehicle can be: "+ super.maxSpeed);
        System.out.println("max speed fo car can be: "+ this.maxSpeed);
    }
}

class Vehicle{
    int maxSpeed = 100; // instance variable

    void message(){
        System.out.println("This is the vehicle class");
    }
}
