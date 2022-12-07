package lab6;


import org.jetbrains.annotations.Nullable;

import static lab6.Lab_6_additionalValues.t;
import static lab6.Lab_6_additionalValues.w;

public class Lab_6 {
    static double eps = 1e-3;

    //1,2
    static double f1(double x) {
        return Math.log(Math.sin(1 / Math.pow(x, 2)));
    }

    //1,2
    static double f2(double x) {
        return Math.pow(x, 2) * Math.sin(1 / Math.pow(x, 2));
    }

    public static @Nullable Object gauss1() {
        int a = 1, b = 2, i = 0;
        double integral = 0.0, diff = 0.0, i_n = 0, i_p = 0;
        for (i = 0; i < w().length; i++) {
            for (int j = 0; j < w()[i].length; j++) {
                integral += w()[i][j] * f1(0.5 * (a + b + t()[i][j] * (b - a)));
            }

            i_n = (0.5 * (b - a) * integral);
            if (i >= 1) {
                diff = Math.abs(i_n - i_p);
                System.out.println("I" + (i + 1) + " - " + "I" + i + " " + " = " + diff);
                if (diff < eps) {
                    System.out.println("integral 1 = " + i_n + " F'n =" + (i + 1));
                }
                i_p = i_n;
            }
        }
        return null;
    }

    public static @Nullable Object gauss2() {
        double integral = 0.0;
        double diff = 0.0;
        double i_n = 0;
        double i_p = 0;
        int i = 0;
        int a = 1;
        int b = 2;
        for (i = 0; i < w().length; i++) {
            for (int j = 0; j < w()[i].length; j++) {
                integral += w()[i][j] * f2(0.5 * (a + b + t()[i][j] * (b - a)));
            }
            i_n = (0.5 * (b - a) * integral);
            if (i >= 1) {
                diff = Math.abs(i_n - i_p);
                System.out.println("I" + (i + 1) + " - " + "I" + i + " " + " = " + diff);
                if (diff < eps) {
                    System.out.println("integral 1 = " + i_n + " F'n =" + (i + 1));
                }
                i_p = i_n;
            }
        }
        return null;
    }
}

