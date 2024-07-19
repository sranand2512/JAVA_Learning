package May.ex_16_May_2024.Multilevel_inheritance.APIautomation;

public class Test extends BaseTest{

    void accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(api_version);
        System.out.println(version);
    }
    void openJsn(){
        System.out.println("Test");
    }
}
