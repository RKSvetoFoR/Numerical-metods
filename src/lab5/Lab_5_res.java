package lab5;


import java.util.ArrayList;
import java.util.List;

public class Lab_5_res {
    static  List<Double> res1() {
        List<Double> value = new ArrayList<>();
        int i = 0;
        double eps = 0.00001;
        value.add(0.0);
        value.add(0.0);
        double I = 1;
        int a = 3;
        int b = 5;
        while (I > eps) {
            i++;
            I = 1 / 3.0 * Math.abs(Lab_5.scale1(2 * i, a, b) - Lab_5.scale1(i, a, b));
            value.set(0, Lab_5.scale1(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static  List<Double> res2() {
        List<Double> value = new ArrayList<>();
        int i = 0;
        double I = 1;
        value.add(0.0);
        value.add(0.0);
        double eps = 0.0001;
        int a = 3;
        int b = 4;
        while (I > eps) {
            i++;
            I = 1 / 3.0 * Math.abs(Lab_5.scale2(2 * i, a, b) - Lab_5.scale2(i, a, b));
            value.set(0, Lab_5.scale2(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static  List<Double> res3() {
        List<Double> value = new ArrayList<>();
        int i = 0;
        double I = 1;
        value.add(0.0);
        value.add(0.0);
        double eps = 0.0001;
        int a = 1;
        int b = 2;
        while (I > eps) {
            i++;
            I = 1 / 3.0 * Math.abs(Lab_5.scale3(2 * i, a, b) - Lab_5.scale3(i, a, b));
            value.set(0, Lab_5.scale3(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static  List<Double> res4() {
        List<Double> value = new ArrayList<>();
        int i = 0;
        double I = 1;
        value.add(0.0);
        value.add(0.0);
        double eps = 0.0001;
        int a = 2;
        int b = 3;
        while (I > eps) {
            i++;
            I = 1 / 3.0 * Math.abs(Lab_5.scale4(2 * i, a, b) - Lab_5.scale4(i, a, b));
            value.set(0, Lab_5.scale4(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }

    static  List<Double> res5() {
        List<Double> value = new ArrayList<>();
        int i = 0;
        double I = 1;
        double eps = 0.0001;
        value.add(0.0);
        value.add(0.0);
        int a = 1;
        int b = 2;
        while (I > eps) {
            i++;
            I = 1 / 3.0 * Math.abs(Lab_5.scale5(2 * i, a, b) - Lab_5.scale5(i, a, b));
            value.set(0, Lab_5.scale5(i, a, b));
            value.set(1, (double) i);
        }
        return value;
    }
}
