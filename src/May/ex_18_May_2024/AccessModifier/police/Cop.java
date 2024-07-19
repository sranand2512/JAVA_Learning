package May.ex_18_May_2024.AccessModifier.police;

public class Cop {
    public int gun; // public means access by anyone
    private  String idCard; // private means access by cop means the current class only


    public Cop(int gun){
        this.gun = gun; // PC
    }

    protected void canIShoot(){
        System.out.println("Yes you can, Shoot !!! ");
    }

}
