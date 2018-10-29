package com.pavbox;
import java.util.Scanner;

/**
 *
 * Постановка задачи:
 *
 * Обнулить все элементы заданного столбца матрицы.
 *
 */


public class Main {

    // setup base matrix
    private static int[][] matrix = {
            {1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3, 3},
    };

    // main thread of program
    public static void main(String[] args) {
        printMatrix();

        int number = Main.getNumber();
        Main.cleanBy(number);

        printMatrix();

    }

    // zeroing column by number
    private static void cleanBy(int number) {

        for (int idx = 0; idx < matrix.length; idx++) {
            matrix[idx][number] = 0;
        }

    }

    private static int getNumber() {
        System.out.print("Please, write number of column: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // print full matrix image into console
    private static void printMatrix() {
        for (int[] column : matrix) {
            for (int cell : column) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
