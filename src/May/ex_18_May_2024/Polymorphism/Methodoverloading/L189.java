package May.ex_18_May_2024.Polymorphism.Methodoverloading;

public class L189 {
 // Constructor overloading

    L189(){
    }

    L189(int a){
    }

    L189(int a, int b){
    }

    L189(int a, String s){
    }



// Method OverLoading -> multiple methods with same name , but different arguments.

    void gift(String a){
    System.out.println("String "+ a);
    }

    int gift(int x){
        System.out.println("Int "+ x);
        return x;
    }
        int gift(float x){
        System.out.println("Int "+ x);
        return 89;
    }
    void gift(double x){
        System.out.println("Int "+ x);

    }


    //--------
    public static void main(String[] args) {
        L189 p = new L189();
        p.gift("Saurabh");
    }
   
}

