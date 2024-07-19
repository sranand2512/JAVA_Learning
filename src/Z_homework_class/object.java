package Z_homework_class;

public class object {
    public static void main(String[] args) {

       // Student 1
        System.out.println("Student 1");
        student student1 = new student();
        student1.name = "Saurabh Kumar";
        student1.age = 19;
        student1.dob = "10-Jan-2005";
        student1.emailId="saurabh@gmail.com";
        student1.phoneNumber=9198725364l;

        student1.eat("Apple");
        student1.sleep();
        student1.study();

        course c_student1 = new course();
        c_student1.amount = 30000f;
        c_student1.courseName = "Automation Testing";
        c_student1.courseId = "AT001";

        c_student1.canSee();
        c_student1.canDownload();
        c_student1.canSeeagain();

        payment p_student1 = new payment();
        p_student1.paymentMode = "Online";

        p_student1.cash();
        p_student1.paypal();
        p_student1.upi();

        // Student 2.

        System.out.println("\nStudent 2");
        student student2 = new student();
        student2.name = "Abhishek Kumar";
        student2.age = 23;
        student2.dob = "10-Jan-2001";
        student2.emailId="abhishek@gmail.com";
        student2.phoneNumber=9165983249l;

        student2.eat("Pineapple");
        student2.sleep();
        student2.study();

        course c_student2 = new course();
        c_student2.amount = 40000f;
        c_student2.courseName = "Automation Testing with manual API";
        c_student2.courseId = "AT001MA";

        c_student2.canSee();
        c_student2.canDownload();
        c_student2.canSeeagain();

        payment p_student2 = new payment();
        p_student2.paymentMode = "Online";

        p_student2.cash();
        p_student2.paypal();
        p_student2.upi();

        // Student 3
        System.out.println("\nStudent 3");
        student student3 = new student();
        student3.name = "Sudheer Kumar";
        student3.age = 25;
        student3.dob = "10-Jan-1999";
        student3.emailId="sudheer@gmail.com";
        student3.phoneNumber=+9195879654l;

        student3.eat("Orange");
        student3.sleep();
        student3.study();

        course c_student3 = new course();
        c_student3.amount = 45000f;
        c_student3.courseName = "Automation Testing with Automation API";
        c_student3.courseId = "AT001AA";

        c_student3.canSee();
        c_student3.canDownload();
        c_student3.canSeeagain();

        payment p_student3 = new payment();
        p_student3.paymentMode = "Online";

        p_student3.cash();
        p_student3.paypal();
        p_student3.upi();
    }
}
