package May.ex_18_May_2024.ThisandSuper;

public class L183_super_constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        // super.variable
        // super.method()
        // super()  -> DC
        // super("string")
    }
}
class  Person1{
    Person1(){
        System.out.println("Person1 - DC");
    }

    Person1(String a){
        System.out.println("Person1 - PC");
    }

    Person1(String a, int b){
        System.out.println("Person1 - PC");
    }

}

class Student1 extends Person1{
    Student1(){
        //super();, the time when we create a DC in child then by default parents constructor will be called  using super keyword.
       // super();
      //  super("Saurabh");

        // exact matching constructor will be called using super and if not the by default DC will be called
        super("Saurabh", 18);

        System.out.println("Student1 -DC");
    }
        }

