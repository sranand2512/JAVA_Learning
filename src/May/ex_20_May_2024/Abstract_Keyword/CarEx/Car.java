package May.ex_20_May_2024.Abstract_Keyword.CarEx;

public class Car extends Engine {
    @Override
    void start() {
        System.out.println("Starting ");

    }

    @Override
    void stop() {
        System.out.println("Stoping");

    }

    @Override
    void partGearBox() {
        System.out.println("Assembling the Gearbox");

    }
}
