package May.ex_04_May_2024;

public class L136_2D_array {
    public static void main(String[] args) {
        //Horizontal array or 1D array
        int[] arrays = {30,25,36,55};
        int[] arrays2 = new int[4];

        for (int i = 0; i < arrays.length; i++) {
            arrays2[i]=arrays[i]*2;

        }
        System.out.println("Arrays");
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println(arrays2[i]);

        }
    }
}
