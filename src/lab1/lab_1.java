package lab1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class lab_1 {
    public static Object lagrang() {
        long start = System.currentTimeMillis();
        double[] xi = new double[]{1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
        double[] F = new double[]{2.7182, 3.0041, 3.3201, 3.6692, 4.0552, 4.4816, 4.953, 5.4739, 6.0496, 6.6858, 7.389};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        double x = sc.nextDouble();
        double L = 0.0;
        double temp = 1.0;

        for (int i = 0; i < xi.length; i++) {
            for (int j = 0; j < xi.length; j++) {
                if (i != j) temp *= (x - xi[j]) / (xi[i] - xi[j]);
            }
            L += F[i] * temp;
            temp = 1.0;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
        System.out.println(L);
        return null;
    }

    public static Object aitken() {
        double[] xi = new double[]{1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
        double[] fi = new double[]{2.7182, 3.0041, 3.3201, 3.6692, 4.0552, 4.4816, 4.953, 5.4739, 6.0496, 6.6858, 7.389};
        double[] abss = new double[fi.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        double x = sc.nextDouble();
        double eps = 0.001;
        int k, c = 0;
        double l = 0, g = 0;
        double result = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < fi.length; i++) {
            abss[i] = abs(xi[i] - x);
        }
        Qsort(xi, abss, fi, c, fi.length - 1);
        ArrayList<ArrayList<Double>> Lii = new ArrayList<>();
        ArrayList<Double> Fi = new ArrayList<>();
        ArrayList<Double> E = new ArrayList<>();
        for (double v : fi) {
            Fi.add(v);
        }
        Lii.add(Fi);

        for (int i = 0; i < Lii.size(); i++) {

            ArrayList<Double> F = new ArrayList<>();
            k = i;
            for (int j = 0; j < Lii.get(i).size() - 1; j++) {
                k++;
                F.add((Lii.get(i).get(j + 1) * (x - xi[j]) - Lii.get(i).get(j) * (x - xi[k])) / (xi[k] - xi[j]));
            }
            if (F.isEmpty()) break;
            Lii.add(F);
            E.add(abs((Lii.get(i + 1).get(0) - Lii.get(i).get(0))));
            if (E.get(i) <= eps) {
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                result = Lii.get(i).get(0);
                System.out.println("Прошло времени, мс: " + elapsed);
                l++;
                g++;
                break;
            }
        }

        if (l == 0) {
            int h = 0;
            for (int i = 0; i < E.size() - 1; i++) {
                int p;
                p = i;
                p++;
                if (E.get(i) < E.get(p)) {
                    h++;
                }
                if ((E.size() - h) <= 4) {
                    long finish = System.currentTimeMillis();
                    long elapsed = finish - start;
                    result = Lii.get(E.size()).get(0);
                    System.out.println("Прошло времени, мс: " + elapsed);
                    break;
                }
            }
        } else if (g == 0) {
            int[] s = new int[E.size()];
            for (int i = 0; i < E.size(); i++) {
                s[i] = i;
            }
            Qsort1(E, s, 0, E.size() - 1);
            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            result = Lii.get(s[0] + 1).get(0);
            System.out.println("Прошло времени, мс: " + elapsed);
        }
        System.out.println(result);
        return null;
    }

    public static void Qsort(double[] a, double[] b, double[] c, int q, int n) {
        if (n > 0 && q <= n) {
            int middle = q + (n - q) / 2;
            double base = a[middle];
            int i = q;
            int j = n;

            while (i <= j) {
                while (a[i] < base) {
                    ++i;
                }

                while (a[j] > base) {
                    --j;
                }

                if (i <= j) {
                    double k = b[i];
                    b[i] = b[j];
                    b[j] = k;
                    double k1 = a[i];
                    a[i] = a[j];
                    a[j] = k1;
                    double k2 = c[i];
                    c[i] = c[j];
                    c[j] = k2;
                    ++i;
                    --j;
                }
            }

            if (q < j) {
                Qsort(a, b, c, q, j);
            }

            if (n > i) {
                Qsort(a, b, c, i, n);
            }
        }
    }

    public static void Qsort1(ArrayList<Double> a, int[] c, int q, int n) {
        if (n > 0 && q <= n) {
            int middle = q + (n - q) / 2;
            double base = a.get(middle);
            int i = q;
            int j = n;

            while (i <= j) {
                while (a.get(i) < base) {
                    ++i;
                }

                while (a.get(j) > base) {
                    --j;
                }

                if (i <= j) {
                    double k = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, k);
                    int k2 = c[i];
                    c[i] = c[j];
                    c[j] = k2;
                    ++i;
                    --j;
                }
            }

            if (q < j) {
                Qsort1(a, c, q, j);
            }

            if (n > i) {
                Qsort1(a, c, i, n);
            }
        }
    }
}
