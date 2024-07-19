package May.ex_18_May_2024.ThisandSuper;

public class L184 {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // the DC of Dog called and due to construction chaining default constructor of Animal is also called.
        Dog d2 = new Dog("Lebra");
        Dog d3 = new Dog("Golden retriver", "Newtype");
        d2.display();
        d3.display();
    }
}

class Animal{
    String type;
    Animal(){
        System.out.println("Animal DC");
    }

    Animal(String type){
        this.type=type;
        System.out.println("Animal PC");
    }
}

class Dog extends Animal{
    String breed;
    Dog(){
        System.out.println("Dog DC");
    }

    Dog(String breed){
        super("DogType");
        this.breed =breed;
        System.out.println("Dog PC");
    }
    Dog(String breed, String type){
        super("type");
        this.breed =breed;
        System.out.println("Dog PC");
    }

    void display(){
        System.out.println("Type: "+ super.type+ "\nBreed: "+breed);
    }
}
