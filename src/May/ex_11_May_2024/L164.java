package May.ex_11_May_2024;

public class L164 {
    public static void main(String[] args) {
        car tesla = new car();
        tesla.name = "tesla";
        tesla.model = "Model 3";

        tesla.reverse();
        tesla.topSpeed();

        car volvo = new car();
        volvo.model = "XC90";
        volvo.color = "black";
        volvo.name = "Volvo";

        volvo.reverse();
        volvo.topSpeed();
        volvo.musicSystem();



    }
}
