public class Transpoze {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 3, 4 },
                { 5, 6, 4 }
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows]; // Transpoz matrisi oluştur

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j]; // Elemanları yer değiştirerek transpoz matrisini oluştur
            }
        }

        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoz:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
