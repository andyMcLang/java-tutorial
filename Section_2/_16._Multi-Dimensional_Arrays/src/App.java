// 16. Multi-Dimensional Arrays
public class App {
    public static void main(String[] args) {
        int[][] matriisi = {
                {1,2,3},
                {4,5,16,7},
                {8,29}
        };

        for (int i = 0; i < matriisi.length; i++) {
            for (int j = 0; j < matriisi[i].length; j++) {
                System.out.print(matriisi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
