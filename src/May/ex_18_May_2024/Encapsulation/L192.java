package May.ex_18_May_2024.Encapsulation;

public class L192 {
    public static void main(String[] args) {
        vwoLogin1 v1 = new vwoLogin1("admin", "admin123");
        //v1.username = admin;
        String username = v1.getUsername();
        System.out.println(username);

        // here password is secure means if auth is true then only he will be able to see the password.
      //  String password = v1.getPassword(true);
        v1.setPassword("Saurabh", true);
       // System.out.println(password);


    }

}

class vwoLogin1{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword( boolean isAuth) {
        if(isAuth) {
            return password;
        }else {
            return "not allowed";
        }
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth) {
            this.password = password;
        }else {
            System.out.println("Not allowed");
        }
    }

    vwoLogin1(String username, String password){
        this.username = username;
        this.password = password;
    }

}
