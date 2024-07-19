package May.ex_18_May_2024.Encapsulation;

// Use of setter getter with condition to secure the data members by method.

public class ICICBank {
    private String name;
    private long bal;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal >0) {
            this.bal = bal;
        }else {
            System.out.println("Not allowed ");
        }
    }

    public ICICBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
}
