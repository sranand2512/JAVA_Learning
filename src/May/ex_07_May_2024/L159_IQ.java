package May.ex_07_May_2024;

public class L159_IQ {
    public static void main(String[] args) {
        // web automation
        openBrowser("Chrome");
        testLoginpage1();
        testLoginpage("Page 2");
        closeBrowser("chrome");

        System.out.println(" ------ ");


        openBrowser("Firefox");
        testLoginpage1();
        testLoginpage("Page 3");
        closeBrowser("firefox");

    }

    static void testLoginpage1() {
        System.out.println("Testing page 1 opened");
    }
    static void testLoginpage(String page) {
        System.out.println("Testing page - "+ page);
    }


    static void openBrowser( String browser) {
        System.out.println(browser+ " browser open");
    }

    static void closeBrowser(String browser2) {
        System.out.println(browser2 +" browser close");
    }
}