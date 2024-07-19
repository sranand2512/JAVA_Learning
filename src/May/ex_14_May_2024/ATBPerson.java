package May.ex_14_May_2024;

public class ATBPerson {
    // Variables

    String name;
    Long phone;
    String email;
    boolean isMarried = true;
    String coursename;// = "ATB";

    void printDetails() {
        System.out.println("Details of student");
    }


    /* Constructor
     Default constructor: Special method that does not return anything
     Called only once when you create a new object
     it has same name as className
    */
    // Default Constructor
    ATBPerson() {
        // System.out.println("default constructor");
        coursename = "ATB";

    }

    // Param Constructor.
    ATBPerson(Long phoneNo, String givenName, String emailId, boolean ismarried, String courseName) {
        this.phone = phoneNo;
        this.name = givenName;
        this.email = emailId;
        this.isMarried = ismarried;
        this.coursename = courseName;
    }

    ATBPerson(String givenName, Long phoneNo) {
        this.phone = phoneNo;
        this.name = givenName;
    }

// this not constructor it is just a function

        void ATBPerson() {
            System.out.println("not default constructor/ it is a function");
        }

}