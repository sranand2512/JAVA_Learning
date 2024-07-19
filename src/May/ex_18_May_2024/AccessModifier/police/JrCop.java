package May.ex_18_May_2024.AccessModifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        cop.canIShoot();
    }
}
