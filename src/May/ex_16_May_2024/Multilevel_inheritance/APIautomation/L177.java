package May.ex_16_May_2024.Multilevel_inheritance.APIautomation;

public class L177 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.openExcelFile();
        t1.openSQLConnection();
        int a = t1.api_version;

        CommonToAll c = new Test();
        c.openExcelFile();
        c.openJsn();
    }
}
