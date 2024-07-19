package May.ex_14_May_2024;

public class Person {


    String name;
    int age ;

    Person(String name, int age) { // PM Constructor
        this.name = name;
        this.age = age;
    }

    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }


    public static void main(String[] args) {
        Person person1 = new Person("Saurabh", 24);
        System.out.println(person1.name+ " is "+ person1.age+" years old." );

        Person person2 = new Person(person1);
        System.out.println(person2.name+ " is "+ person2.age+" years old." );
    }

}
