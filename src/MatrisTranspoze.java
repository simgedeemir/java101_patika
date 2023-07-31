public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoze:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
