import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class lab_5_res {
    static @NotNull List<Double> res1() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        double eps = 1e-4;
        value.add(0.0);
        value.add(0.0);
        int a = 3;
        int b = 5;
        while (accuracy.get(i) > eps) {
            i++;
            System.out.println(i);
            accuracy.add(1 / 3 * Math.abs(lab_5.scale1(2 * i, a, b) - lab_5.scale1(i, a, b)));
            value.set(0, lab_5.scale1(i, a, b));
            value.set(1, (double) i);
        }
        value.set(0, lab_5.scale1(i - 1, a, b));
        value.set(1, (double) i - 1);
        return value;
    }

    static @NotNull List<Double> res2() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        value.add(0.0);
        value.add(0.0);
        double eps = 1e-4;
        int a = 3;
        int b = 4;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3 * Math.abs(lab_5.scale2(2 * i, a, b) - lab_5.scale2(i, a, b)));
            value.set(0, lab_5.scale2(i, a, b));
            value.set(1, (double) i);
        }
        value.set(0, lab_5.scale2(i - 1, a, b));
        value.set(1, (double) i - 1);
        return value;
    }

    static @NotNull List<Double> res3() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        value.add(0.0);
        value.add(0.0);
        double eps = 1e-4;
        int a = 1;
        int b = 2;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3 * Math.abs(lab_5.scale3(2 * i, a, b) - lab_5.scale3(i, a, b)));
            value.set(0, lab_5.scale3(i, a, b));
            value.set(1, (double) i);
        }
        value.set(0, lab_5.scale3(i - 1, a, b));
        value.set(1, (double) i - 1);
        return value;
    }

    static @NotNull List<Double> res4() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        value.add(0.0);
        value.add(0.0);
        double eps = 1e-4;
        int a = 2;
        int b = 3;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3 * Math.abs(lab_5.scale4(2 * i, a, b) - lab_5.scale4(i, a, b)));
            value.set(0, lab_5.scale4(i, a, b));
            value.set(1, (double) i);
        }
        value.set(0, lab_5.scale4(i - 1, a, b));
        value.set(1, (double) i - 1);
        return value;
    }

    static @NotNull List<Double> res5() {
        List<Double> accuracy = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        int i = 0;
        accuracy.add(1.0);
        double eps = 1e-4;
        value.add(0.0);
        value.add(0.0);
        int a = 1;
        int b = 2;
        while (accuracy.get(i) > eps) {
            i++;
            accuracy.add(1 / 3 * Math.abs(lab_5.scale5(2 * i, a, b) - lab_5.scale5(i, a, b)));
            value.set(0, lab_5.scale5(i, a, b));
            value.set(1, (double) i);
        }
        value.set(0, lab_5.scale5(i - 1, a, b));
        value.set(1, (double) i - 1);
        return value;
    }
}
