package lab5;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Lab_5_res {
    static @NotNull List<Double> res1() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        double eps = 0.0001;
        value.add(0.0);
        value.add(0.0);
        int a = 3;
        int b = 5;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3.0 * Math.abs(Lab_5.scale1(2 * i, a, b) - Lab_5.scale1(i, a, b)));
            value.set(0, Lab_5.scale1(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static @NotNull List<Double> res2() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        value.add(0.0);
        value.add(0.0);
        double eps = 0.0001;
        int a = 3;
        int b = 4;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3.0 * Math.abs(Lab_5.scale2(2 * i, a, b) - Lab_5.scale2(i, a, b)));
            value.set(0, Lab_5.scale2(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static @NotNull List<Double> res3() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        value.add(0.0);
        value.add(0.0);
        double eps = 0.0001;
        int a = 1;
        int b = 2;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3.0 * Math.abs(Lab_5.scale3(2 * i, a, b) - Lab_5.scale3(i, a, b)));
            value.set(0, Lab_5.scale3(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static @NotNull List<Double> res4() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        value.add(0.0);
        value.add(0.0);
        double eps = 0.0001;
        int a = 2;
        int b = 3;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3.0 * Math.abs(Lab_5.scale4(2 * i, a, b) - Lab_5.scale4(i, a, b)));
            value.set(0, Lab_5.scale4(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static @NotNull List<Double> res5() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        double eps = 0.0001;
        value.add(0.0);
        value.add(0.0);
        int a = 1;
        int b = 2;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3.0 * Math.abs(Lab_5.scale5(2 * i, a, b) - Lab_5.scale5(i, a, b)));
            value.set(0, Lab_5.scale5(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }
}
