package May.ex_18_May_2024.Polymorphism.Methodoverriding;

public class L186_access_modifier {
    public static void main(String[] args) {

    }
}
class p{
    void m1(){
        System.out.println("M1");
    }
    void m2(){
        m1();
        System.out.println("M2");
    }
}