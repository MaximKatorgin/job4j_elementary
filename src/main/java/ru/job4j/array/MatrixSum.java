package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] i : array) {
            for (int j : i) {
                result += j;
            }
        }
        return result;
    }
}
