package lab3;

import java.util.ArrayList;

public class Lab_3 {
    public static Object splines(){
        double x[] = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1};
        double y[] = {2, 2.105, 2.221, 2.349, 2.491, 2.648, 2.822, 3.013, 3.225, 3.459, 3.718};
        int N = 11;
        double[] a = new double[11];
        double[] b = new double[11];
        double[] d = new double[11];
        double[] c = new double[11];
        c[0] = 0;
        c[10] = 0;
        double[][] A = new double[11][11];
        double hi = x[1] - x[0];
        double[] Fi = new double[N];
        double[] Ai = new double[N];
        double[] Bi = new double[N];
        double[] Ci = new double[N];
        double[] alpha = new double[N];
        double[] beta = new double[N];

        for (int i = 1; i < (N - 1); i++) {
            Fi[i] = -6 * (((y[i + 1] - y[i]) / hi) - ((y[i] - y[i - 1]) / hi));
        }

        for (int i = 1; i < (N - 1); i++) {
            Ai[i] = hi;
            Bi[i] = hi;
            Ci[i] = -4 * hi;
        }
        alpha[1] = 0.0;
        beta[1] = 0.0;
        for (int i = 1; i < (N - 1); i++) {
            alpha[i + 1] = Bi[i] / (-Ai[i] * alpha[i] + Ci[i]);
            beta[i + 1] = (Fi[i] + Ai[i] * beta[i]) / (-Ai[i] * alpha[i] + Ci[i]);
        }

        for (int i = N - 2; i > 0; i--) {
            c[i] = alpha[i + 1] * c[i + 1] + beta[i + 1];
        }
        for (int i = 0; i < N; i++) {
            a[i] = y[i];
        }
        for (int i = 1; i < N; i++) {
            d[i] = (c[i] - c[i - 1]) / hi;
            b[i] = (hi / 2) * c[i] - (Math.pow(hi, 2) / 6) * d[i] + (y[i] - y[i - 1]) / hi;
        }

        double h = 0.001, g = h;
        int k = 1;
        ArrayList<Double> S = new ArrayList<>();
        for (double i = 0; i < 0.9; i += 0.1) {
            for (double x_i = i; x_i < (i + 0.1); x_i = x_i + h) {
                S.add(a[k] + b[k] * (x_i - x[k]) + (c[k] / 2) * Math.pow((x_i - x[k]), 2) + (d[k] / 6) * Math.pow((x_i - x[k]), 3));
            }
            k++;
        }


        for (int i = 0; i < S.size(); i++) {
            double q = 0.001;
            q *= i;
            System.out.print(q + ",");
        }
        System.out.println(3);
        for (int i = 0; i < S.size(); i++) {
            System.out.print(S.get(i) + ",");
        }
        return null;
    }
}
