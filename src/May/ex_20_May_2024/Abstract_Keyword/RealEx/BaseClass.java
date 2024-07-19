package May.ex_20_May_2024.Abstract_Keyword.RealEx;

abstract class BaseClass {

    // Web Automation
    // hierarchical Inheritance - BaseClass - child1, child2

    abstract String openBrowser();
    abstract String closeBrowser();

    void printLog(){
        System.out.println("Logs");
    }
}
