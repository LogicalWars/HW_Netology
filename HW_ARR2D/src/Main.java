import java.util.Random;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        showMatrix(colors);
        rotateMatrix(colors, rotatedColors, 270);
        System.out.println();
        showMatrix(rotatedColors);
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] matrix, int[][] rotatedMatrix, int rotate) {
        switch (rotate) {
            case 90:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedMatrix[j][SIZE - 1 - i] = matrix[i][j];
                    }
                }
                break;
            case 180:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedMatrix[i][j] = matrix[SIZE - 1 - i][SIZE - 1 - j];
                    }
                }
                break;
            case 270:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedMatrix[SIZE - 1 - j][i] = matrix[i][j];
                    }
                }
                break;
            default:
                System.err.println("Некорректный угол поворота");
        }

    }
}