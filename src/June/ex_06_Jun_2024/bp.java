package June.ex_06_Jun_2024;

public class bp {

    bp step1(){
        System.out.println("1");
        return this;
    }

    bp step2(){
        System.out.println("2");
        return this;
    }

    bp step3(){
        System.out.println("3");
        return this;
    }

    public static void main(String[] args) {
        bp bp1 = new bp();
        bp1.step1().step3().step3();
    }
}
