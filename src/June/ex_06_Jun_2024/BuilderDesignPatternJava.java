package June.ex_06_Jun_2024;

public class BuilderDesignPatternJava {

    public BuilderDesignPatternJava groundFloor(){
        System.out.println("do some task on GF");
        return this;
    }

    public BuilderDesignPatternJava firstFloor(String name){
        System.out.println("do some task on FF"+name);
        return this;
    }

    public BuilderDesignPatternJava secondFloor(String name, String color){
        System.out.println("do some task on SF"+name+color);
        return this;
    }

    public static void main(String[] args) {
        BuilderDesignPatternJava bp = new BuilderDesignPatternJava();
//        bp.groundFloor();
//        bp.firstFloor("FF");
//        bp.secondFloor("SF", "Orange");

       // now instead of calling like we can use builder patter

        bp.groundFloor().firstFloor("FF").secondFloor("SF","orange");

    }

    // same in rest assured
    //Get(), post(), auth().verify()

}
