package May.ex_07_May_2024;

public class L157 {
    public static void main(String[] args) {
      f1();
      String [] names = {"420", "840"};
      f1(names);
    }
    static void f1(String[]a){
        for (String name : a){
            System.out.println(name);
        }
    }

    static void f1(){
        f2();
        System.out.println("F1");
    }
    static void f2(){
        System.out.println("F2");
    }
}
