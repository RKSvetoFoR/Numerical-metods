package lab7;

import java.util.ArrayList;
import java.util.List;

public class Lab_7_additional {
    static double f(double x) {
        return Math.sin(1 / Math.pow(x, 2));
    }

    public static void monteKarlo() {
        List<Double> value = new ArrayList<>();
        int i = 10;
        double eps = 1e-5;
        value.add(0.0);
        value.add(0.0);
        double I = 1.0;
        double a = 3.0;
        double b = 5.0;
        while (I > eps) {
            double sum1 = 0;
            double sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += f(a + (b - a) * Math.random());
            }
            for (int j = 0; j < 2 * i; j++) {
                sum2 += f(a + (b - a) * Math.random());
            }
            I = ((b - a) / (2 * i) * sum2) - (((b - a) / i) * sum1);
            value.set(0, (((b - a) / i) * sum1));
            value.set(1, (double) i);
            i *= 2;
        }
        System.out.println("Метод Монте-Карло,доп задание");
        System.out.println(value);
        System.out.println();
    }

    public static void res() {
        List<Double> value = new ArrayList<>();
        int i = 1;
        double I = 1;
        double eps = 1e-5;
        value.add(0.0);
        value.add(0.0);
        int a = 3;
        int b = 5;
        while (I > eps) {
            i *= 2;
            I = 1 / 3.0 * Math.abs(scale(2 * i, a, b) - scale(i, a, b));
            value.set(0, scale(i, a, b));
            value.set(1, (double) i);
        }
        System.out.println("Метод Трапеций,доп задание");
        System.out.println(value);
    }

    static double scale(int n, int a, int b) {
        double result;
        result = f(b) + f(a);
        for (int i = 1; i < n; i++) {
            result += 2 * f(a + ((double) (b - a) / n) * i);
        }
        result *= ((double) (b - a) / n) / 2;
        return result;
    }
}
