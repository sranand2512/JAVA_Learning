package May.ex_18_May_2024.AccessModifier.criminal;

import May.ex_18_May_2024.AccessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
    }
}
