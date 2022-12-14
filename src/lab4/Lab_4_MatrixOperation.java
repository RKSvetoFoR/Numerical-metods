package lab4;

import org.jetbrains.annotations.NotNull;

class Lab_4_MatrixOperation {

    public static double[] @NotNull [] Transposition(int n, int m, double[][] matrix) {
        double[][] AxT = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                AxT[i][j] = matrix[j][i];
            }
        }
        return AxT;
    }

    public static double[] @NotNull [] MatrixMultMatrix(double[][] firstMatrix, double[][] secondMatrix,
                                                        int n1, int n2, int m2) {
        double[][] result = new double[n1][m2];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m2; j++)
                for (int k = 0; k < n2; k++) result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
        return result;
    }

}
