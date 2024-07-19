package May.ex_18_May_2024.Encapsulation;

public class L191 {
    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("admin", "admin123");
//        v1.username = "admin";
//        v1.password = "admin123";

       // System.out.println(v1.password);
    }
/*
* Encapsulation says hide your data member, so we have made it private but in this case the username and password both are private
* but the username should be visible to the user, and we made it public but in this scenario if third parti can chnage the username */

}

class vwoLogin{

    private String username;
    private String password;

    public vwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }




}
