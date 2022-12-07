package lab5;

import org.jetbrains.annotations.NotNull;
import java.util.*;

public class lab_5 {
    static double scale1(int n, int a, int b) {
        double result;
        result = (f1(b) + f1(a)) / 2;
        for (int i = 1; i < n; i++) {
            result += f1(a + ((b - a) / n) * i);
        }
        return result * (b - a) / n;
    }

    static double scale2(int n, int a, int b) {
        double result;
        result = (f2(b) + f2(a)) / 2;
        for (int i = 1; i < n; i++) {
            result += f2(a + ((b - a) / n) * i);
        }
        return result * (b - a) / n;
    }

    static double scale3(int n, int a, int b) {
        double result;
        result = (f3(b) + f3(a)) / 2;
        for (int i = 1; i < n; i++) {
            result += f3(a + ((b - a) / n) * i);
        }
        return result * (b - a) / n;
    }

    static double scale4(int n, int a, int b) {
        double result;
        result = (f4(b) + f4(a)) / 2;
        for (int i = 1; i < n; i++) {
            result += f4(a + ((b - a) / n) * i);
        }
        return result * (b - a) / n;
    }

    static double scale5(int n, int a, int b) {
        double result;
        result = (f5(b) + f5(a)) / 2;
        for (int i = 1; i < n; i++) {
            result += f5(a + ((b - a) / n) * i);
        }
        return result * (b - a) / n;
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

    public static @NotNull Map<String, List> trapez() {
        Map<String, List> result = new HashMap<>();
        result.put("Sin(1/x^2)", lab_5_res.res1());
        result.put("Ln(x)*Sin(1/x^3)", lab_5_res.res2());
        result.put("e^(2x)*cos(1/x)", lab_5_res.res3());
        result.put("e^x/x*Sin(1/x^3)", lab_5_res.res4());
        result.put("3^x/x^2*Ln(x^2)", lab_5_res.res5());
        return result;
    }

}
