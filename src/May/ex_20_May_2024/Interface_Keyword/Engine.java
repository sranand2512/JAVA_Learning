package May.ex_20_May_2024.Interface_Keyword;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void haltingEngineBeforeStart(){
        System.out.println("Halt the Engine Before Start");
    }

    default void haltingEngineBeforeStop(){
        System.out.println("Halt the Engine Before Stop");
    }

    static void m1(){
        System.out.println("m1");
    }

}
