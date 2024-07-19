package May.ex_14_May_2024;

public class L169_constructor {
    public static void main(String[] args) {
        ATBPerson  person1 = new ATBPerson();
        person1.name = "Saurabh";

        ATBPerson  person3 = null;
        System.out.println(person1.coursename);
        System.out.println(person1.isMarried);
        System.out.println(person1.name);
       // person1.ATBPerson();

        System.out.println("----\n");


        // DC is created to assign the value of instance variable of the class


        ATBPerson  person2 = new ATBPerson();
        person2.name = "Kumar";
        System.out.println(person2.coursename);
        System.out.println(person2.isMarried);
        System.out.println(person2.name);
    }
}
