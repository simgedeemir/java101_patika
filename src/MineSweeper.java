import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int[][] mineField;
    private boolean[][] revealedCells;
    private int rows;
    private int columns;
    private int totalMines;
    private int remainingCells;

    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.mineField = new int[rows][columns];
        this.revealedCells = new boolean[rows][columns];
        this.totalMines = (rows * columns) / 4;
        this.remainingCells = rows * columns;

        initializeMineField();
        placeMines();
    }

    private void initializeMineField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mineField[i][j] = 0;
                revealedCells[i][j] = false;
            }
        }
    }

    private void placeMines() {
        Random random = new Random();

        int minesPlaced = 0;
        while (minesPlaced < totalMines) {
            int row = random.nextInt(rows);
            int col = random.nextInt(columns);

            if (mineField[row][col] != -1) {
                mineField[row][col] = -1;
                updateAdjacentCells(row, col);
                minesPlaced++;
            }
        }
    }

    private void updateAdjacentCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < columns && mineField[i][j] != -1) {
                    mineField[i][j]++;
                }
            }
        }
    }

    private void displayBoard() {
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (revealedCells[i][j]) {
                    if (mineField[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(mineField[i][j] + " ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    private void revealCell(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            System.out.println("Geçersiz bir nokta girdiniz. Lütfen tekrar deneyin.");
            return;
        }

        if (revealedCells[row][col]) {
            System.out.println("Bu nokta zaten seçildi. Lütfen farklı bir nokta seçin.");
            return;
        }

        revealedCells[row][col] = true;
        remainingCells--;

        if (mineField[row][col] == -1) {
            displayBoard();
            System.out.println("Game Over!!");
            System.exit(0);
        }

        if (mineField[row][col] == 0) {
            revealAdjacentCells(row, col);
        }

        if (remainingCells == totalMines) {
            displayBoard();
            System.out.println("Oyunu Kazandınız !");
            System.exit(0);
        }
    }

    private void revealAdjacentCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < columns && !revealedCells[i][j]) {
                    revealedCells[i][j] = true;
                    remainingCells--;

                    if (mineField[i][j] == 0) {
                        revealAdjacentCells(i, j);
                    }
                }
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayBoard();
            System.out.print("Satır Giriniz: ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int col = scanner.nextInt();
            revealCell(row, col);
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        MineSweeper mineSweeper = new MineSweeper(rows, columns);
        mineSweeper.play();
    }
}
