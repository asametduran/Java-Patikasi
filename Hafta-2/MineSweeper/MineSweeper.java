import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rows;
    private int columns;
    private char[][] board;
    private boolean[][] mines;
    private int remainingCells;

    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
        this.mines = new boolean[rows][columns];
        this.remainingCells = rows * columns;
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (char[] row : board) {
            Arrays.fill(row, '-');
        }
    }

    private void placeMines() {
        int numMines = remainingCells / 4;
        Random random = new Random();

        while (numMines > 0) {
            int row = random.nextInt(rows);
            int column = random.nextInt(columns);

            if (!mines[row][column]) {
                mines[row][column] = true;
                numMines--;
            }
        }
    }

    private boolean isValidCell(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    private int countAdjacentMines(int row, int column) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (isValidCell(i, j) && mines[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private void revealCell(int row, int column) {
        if (!isValidCell(row, column) || board[row][column] != '-') {
            return;
        }

        int adjacentMines = countAdjacentMines(row, column);
        board[row][column] = (char) (adjacentMines + '0');
        remainingCells--;

        if (adjacentMines == 0) {
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = column - 1; j <= column + 1; j++) {
                    if (isValidCell(i, j) && board[i][j] == '-') {
                        revealCell(i, j);
                    }
                }
            }
        }
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        while (true) {
            System.out.println("Oyun Durumu:");
            printBoard();

            System.out.print("Satır Giriniz: ");
            int row = input.nextInt();

            System.out.print("Sütun Giriniz: ");
            int column = input.nextInt();

            if (!isValidCell(row, column)) {
                System.out.println("Geçersiz bir nokta girdiniz. Tekrar deneyin.");
                continue;
            }

            if (mines[row][column]) {
                System.out.println("Game Over!!");
                revealAllCells();
                printBoard();
                break;
            } else {
                revealCell(row, column);

                if (remainingCells == 0) {
                    System.out.println("Oyunu Kazandınız!");
                    printBoard();
                    break;
                }
            }
        }
    }

    private void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private void revealAllCells() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mines[i][j]) {
                    board[i][j] = '*';
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int rows = input.nextInt();

        System.out.print("Sütun Sayısını Giriniz: ");
        int columns = input.nextInt();

        MineSweeper game = new MineSweeper(rows, columns);
        game.play();
    }
}
