package com.pavbox;

import java.util.Scanner;

/**
 *
 * Является ли матрица линейно-возрастающей (убывающей) по траектории обхода (змейкой):
 *
 *  [ 4, 5, 12, 13 ]
 *  [ 3, 6, 11, 14 ]
 *  [ 2, 7, 10, 15 ]
 *  [ 1, 8,  9, 16 ]
 *
 */

public class Main {

    final private static int MATRIX_SIZE = 4;

    private static float[][] matrix = {
            { 4.16f, 5.12f, 8.35f, 9.21f },
            { 3.12f, 5.25f, 8.25f, 9.52f },
            { 2.80f, 5.75f, 7.12f, 9.66f },
            { 1.25f, 6.12f, 6.32f, 9.78f },
    };

    public static void main(String[] args) {

        printMatrix();

        boolean isLinear = isLinearGrowingMatrix();
        System.out.println(isLinear);

    }

    // Check matrix for isLinear type.
    private static boolean isLinearGrowingMatrix() {

        float[] linearVector = getLinearVectorFromMatrix(matrix);

        boolean isLinear = true;

        for (int idx_i = 1; idx_i < linearVector.length; idx_i++) {
            if (linearVector[idx_i - 1] > linearVector[idx_i]) {
                isLinear = false;
                break;
            }
        }

        return isLinear;
    }

    // Collect all items of matrix to simple linear vector.
    private static float[] getLinearVectorFromMatrix(float[][] matrix) {

        float[] vector = new float[MATRIX_SIZE * MATRIX_SIZE];

        for (int idx_i = 0; idx_i < MATRIX_SIZE; idx_i++) {
            boolean isEven = (idx_i + 1) % 2 == 0;

            for (int idx_j = 0; idx_j < MATRIX_SIZE; idx_j++) {

                int index = isEven ? idx_j : matrix.length - (idx_j + 1);
                int vectorIndex = idx_i * MATRIX_SIZE + idx_j;

                vector[vectorIndex] = matrix[index][idx_i];

            }
        }

        return vector;
    }

    // print matrix on the screen.
    private static void printMatrix() {
        for (float[] column : matrix) {
            for (float cell : column) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
