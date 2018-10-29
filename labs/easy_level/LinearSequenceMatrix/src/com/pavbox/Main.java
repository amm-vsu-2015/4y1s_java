package com.pavbox;

import java.util.Scanner;
// task 31.

public class Main {

    static float[][] matrix = {
            { 4.16f, 5.12f, 6.32f, 9.21f },
            { 3.12f, 5.25f, 7.12f, 9.52f },
            { 2.80f, 5.75f, 8.25f, 9.66f },
            { 1.25f, 6.12f, 8.35f, 9.78f },
    };

    public static void main(String[] args) {

        printMatrix();

        System.out.println();

        processMatrix();

        System.out.println();

        printMatrix();


    }

    private static void processMatrix() {

        boolean isLinear = true;

        for (int idx_i = 0; idx_i < matrix.length; idx_i++) {

            float[] col = matrix[idx_i];

            for (int idx_j = 0; idx_j < row.length; idx_j++) {

                boolean isEven = (idx_i + 1) % 2 == 0;

                int indexStart = 0;
                int indexEnd = row.length;

                if (isEven) {
                    indexStart += (indexEnd - (indexEnd = indexStart));
                }


            }

        }
        for (int idx_j = 0; idx_j < matrix[].length; idx++) {
            double[] row = matrix[idx];


        }
//
//        for (int idx_i = 0; idx_i < matrix.length; idx_i++) {
//
//            boolean isEven = (idx_i + 1) % 2 == 0;
//            float[] row = matrix[idx_i];
//
//            int indexStart = 0;
//            int indexEnd = row.length;
//
//            if (isEven) {
//                indexStart += (indexEnd - (indexEnd = indexStart));
//            }
//
//
//
//            for (int idx_j = indexStart + 1; idx_j < indexEnd; idx_j++) {
//
//                if (row[idx_j - 1] > row[idx_j]) {
//                    isLinear = false;
//                    break;
//                }
//            }
//
//            if (!isLinear) {
//                break;
//            }
//
//        }

        System.out.println(isLinear);

    }

    private static void printMatrix() {
        for (float[] column : matrix) {
            for (float cell : column) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
