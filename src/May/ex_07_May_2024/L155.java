package May.ex_07_May_2024;

public class L155 {
    public static void main(String[] args) {
        // Friend - ask for money
        // Beggar - ask for money
        System.out.println("Start of program");
        giveMoneyBeggaer();
        int r = giveMoneyFriend(100);
        System.out.println(r);
        System.out.println("End of program");
    }
    static int giveMoneyFriend(int i){
        return i=i-30;
    }
    static void giveMoneyBeggaer(){
        System.out.println("Blessing");
    }
}
