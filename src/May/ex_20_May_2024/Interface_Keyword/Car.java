package May.ex_20_May_2024.Interface_Keyword;

public class Car implements Brake, Engine {
    @Override
    public void applyBrakeFn() {
        System.out.println("Applying brake");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");

    }
}
