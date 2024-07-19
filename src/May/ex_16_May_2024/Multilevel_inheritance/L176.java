package May.ex_16_May_2024.Multilevel_inheritance;

public class L176 {
    public static void main(String[] args) {

//        Child c = new Child();
//        c.home();

//        GrandFather gf = new GrandFather();
//        gf.home();
//
//        Father f = new Father();
//        f.home();


        //Dynamic Dispatch

        GrandFather gf1 = new Child();
        // grandfather reference can all the object, and it will show(use) the attributive and functionality of the class whose object is created in this case it is of child
        // GrandFather reference with child object.
        GrandFather gf2 = new Father();
        GrandFather gf3 = new GrandFather();
        //gf1.home();

        // But Child can not access the GrandFather and fathers because it is like is child is not born then how he can access them.
        // Child can access only child means up to down is possible Grandfather -> Father -> Child reverse is not possible

//        Child c1 = new GrandFather();
//        Child c2 = new Father();
        Child c3 = new Child();

//        Father f1 = new GrandFather();
        Father f2 = new Father();
        Father f3 = new Child(); // Dynamic dispatch
        f3.home();
        gf1.home();



    }
}
