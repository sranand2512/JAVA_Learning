package May.ex_04_May_2024;

public class L143_Stringbuffer_Stringbuilder {
    public static void main(String[] args) {
        String s1 = "Saurabh";
        String s2 = new String("Kumar");

//        StringBuffer stringBuffer = new StringBuffer("SAURABH");
//        stringBuffer.append("_Kumar");
//        stringBuffer.reverse();
//
//        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("SAURABH");
        stringBuilder.append("_kumar");
        stringBuilder.reverse();


        System.out.println(stringBuilder);


    }
}
