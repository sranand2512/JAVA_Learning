package May.ex_18_May_2024.ThisandSuper;

public class L182 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }

}
class Student extends Person{
    void message(){
        System.out.println("I am a Student");
    }

    void display(){
        this.message();
        super.message();
    }
}

class Person{
    void message(){
        System.out.println("I am a Person");
    }
}