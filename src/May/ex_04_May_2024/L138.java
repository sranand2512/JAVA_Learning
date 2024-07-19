package May.ex_04_May_2024;

public class L138 {
    public static void main(String[] args) {
        int [][] arrays_2d = {{325,562,563},{520,452,563}};

        int row = arrays_2d.length; // to find the no of rows

        for (int i = 0; i < arrays_2d.length; i++) {
            for (int j = 0; j < arrays_2d[i].length; j++) {
                System.out.println(arrays_2d[i][j]);

            }

        }
    }
}
