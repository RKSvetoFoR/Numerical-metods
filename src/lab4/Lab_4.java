package lab4;

import java.util.Arrays;

public class Lab_4 {
    static double[] xi = {0, 0.01, 0.02, 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1};
    static double[] yi = {1, 0.9791, 0.9594, 0.9419, 0.9196, 0.9035, 0.8826, 0.8629, 0.8464, 0.8271, 0.811};

    public static void leastSquares() {
        int n = xi.length;
        int m= 2;
        double[][] Ax = new double[xi.length][2];
        double[][] b = new double[xi.length][1];
        for (int i = 0; i < xi.length; i++) {
            Ax[i][0] = xi[i];
            Ax[i][1] = 1.0;
            b[i][0] = yi[i];
        }
        double[][] AxT = Lab_4_MatrixOperation.Transposition(m, n, Ax);
        double[][] AxT_ = Lab_4_MatrixOperation.MatrixMultMatrix(AxT, Ax, m, n, m);
        double[][] b_ = Lab_4_MatrixOperation.MatrixMultMatrix(AxT, b, m, n, 1);
        System.out.println(Arrays.toString(jacobi(AxT_, b_, m)));
    }

    public static double[] jacobi(double[][] A, double[][] B, int n) {
        double eps = 1e-6;
        double norm = 1000.0;
        double[][] LU = new double[n][n];
        double[] D = new double[n];
        double[] x = new double[n];
        double[] xk = new double[n];
        double sum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    LU[i][j] = A[i][j];
                }
            }
            D[i] = A[i][i];
            x[i] = 1 + B[i][0] / D[i];
        }
        while (Math.sqrt(norm) >= eps) {
            for (int i = 0; i < n; i++) {
                xk[i] = x[i];
                sum = 0.0;
                for (int j = 0; j < n; j++) {
                    sum += LU[i][j] * xk[j];
                }
                x[i] = (1 / D[i]) * (B[i][0] - sum);
                double abs = Math.abs(xk[i] - x[i]);
                if (i == 0) norm = abs;
                if (abs > norm) norm = abs;
            }
        }
        return x;
    }

}
