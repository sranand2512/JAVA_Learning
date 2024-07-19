package May.ex_16_May_2024;

public class Java extends Programming {
    // Single inheritance -- is a
    // Java is a programming language
    // Python is a programming language

    String newFeature;

    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }
    void printInfo(){
        System.out.println("New feature is -->" +this.newFeature);
        bhk3();
    }


}
