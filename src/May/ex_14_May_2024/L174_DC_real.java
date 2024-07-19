package May.ex_14_May_2024;

public class L174_DC_real {
    String name;

    L174_DC_real(){
        dataBaseConnection();
        ExcelConnection();
    }
    L174_DC_real(String name){
        this.name = name;
    }

    void dataBaseConnection(){
        System.out.println("SQL Concoction is created");
    }

    void ExcelConnection(){
        System.out.println("excel Concoction is created");
    }

    void test1(){
        System.out.println("test1"+ this.name);
    }

    void test2(){
        System.out.println("test2"+this.name);
    }

    public static void main(String[] args) {
        L174_DC_real tc1 = new L174_DC_real(" One@test");
        tc1.dataBaseConnection();
        System.out.println(tc1.name);
        tc1.test1();
        tc1.test2();

        System.out.println("\n");

        L174_DC_real tc2 = new L174_DC_real(" Two@test");
        tc2.ExcelConnection();
        System.out.println(tc2.name);
        tc2.test1();
        tc2.test2();
    }
}
