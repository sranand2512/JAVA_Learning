package April.ex_18042024;

import java.sql.SQLOutput;

public class L035_logical_ORgate {
    public static void main(String[] args) {
        // OR gate

         // T || T -> T
         // T || F -> T
         // F || T -> T
         // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
