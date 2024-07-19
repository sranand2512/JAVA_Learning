package May.ex_14_May_2024;

public class L171 {
    public static void main(String[] args) {
        ATBPerson  person1 = new ATBPerson(6953564765l, "Saurabh", "Saurabh@123", false, "MTC");
        ATBPerson  person2 = new ATBPerson(346546764765l, "Shaam", "Shaam@123", true, "BTC");


        System.out.println(person1.name);
        System.out.println(person1.email);
        System.out.println(person1.coursename);
        System.out.println(person1.isMarried);
        System.out.println(person1.phone);

        System.out.println("----\n");

        System.out.println(person2.name);
        System.out.println(person2.email);
        System.out.println(person2.coursename);
        System.out.println(person2.isMarried);
        System.out.println(person2.phone);


    }

}
