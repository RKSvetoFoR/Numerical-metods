package lab5;

import java.util.*;

public class Lab_5 {
    static double scale1(int n, int a, int b) {
        double result;
        result = f1(a) + f1(b);
        for (int i = 1; i < n; i++) {
            result += 2 * f1(a + ((double) (b - a) / n) * i);
        }
        result *= ((double) (b - a) / n) / 2;
        return result;
    }

    static double scale2(int n, int a, int b) {
        double result;
        result = f2(b) + f2(a);
        for (int i = 1; i < n; i++) {
            result += 2 * f2(a + ((double) (b - a) / n) * i);
        }
        result *= ((double) (b - a) / n) / 2;
        return result;
    }

    static double scale3(int n, int a, int b) {
        double result;
        result = f3(b) + f3(a);
        for (int i = 1; i < n; i++) {
            result += 2 * f3(a + ((double) (b - a) / n) * i);
        }
        result *= ((double) (b - a) / n) / 2;
        return result;
    }

    static double scale4(int n, int a, int b) {
        double result;
        result = f4(b) + f4(a);
        for (int i = 1; i < n; i++) {
            result += 2 * f4(a + ((double) (b - a) / n) * i);
        }
        result *= ((double) (b - a) / n) / 2;
        return result;
    }

    static double scale5(int n, int a, int b) {
        double result;
        result = f5(b) + f5(a);
        for (int i = 1; i < n; i++) {
            result += 2 * f5(a + ((double) (b - a) / n) * i);
        }
        result *= ((double) (b - a) / n) / 2;
        return result;
    }


    static double f1(double x) {
        return Math.sin(1 / Math.pow(x, 2));
    }

    static double f2(double x) {
        return Math.log(x) * Math.sin(1 / Math.pow(x, 3));
    }

    static double f3(double x) {
        return Math.exp(2 * x) * Math.cos(1 / x);
    }

    static double f4(double x) {
        return (Math.exp(x) / x) * Math.sin(1 / Math.pow(x, 3));
    }

    static double f5(double x) {
        return (Math.pow(3, x) / Math.pow(x, 2)) * Math.log(Math.pow(x, 2));
    }

    public static void trapez() {
        Map<String, List> result = new HashMap<>();
        result.put("Sin(1/x^2)", Lab_5_res.res1());
        result.put("Ln(x)*Sin(1/x^3)", Lab_5_res.res2());
        result.put("e^(2x)*cos(1/x)", Lab_5_res.res3());
        result.put("e^x/x*Sin(1/x^3)", Lab_5_res.res4());
        result.put("3^x/x^2*Ln(x^2)", Lab_5_res.res5());
        for (Map.Entry<String, List> pair : result.entrySet()) {
            System.out.println(pair.getKey() + pair.getValue());
        }
    }

}
