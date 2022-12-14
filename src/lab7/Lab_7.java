package lab7;


import java.util.ArrayList;
import java.util.List;

public class Lab_7 {
    public static void monteKarlo() {
        double[][] interval = {{1, 2}, {2, 4}, {1, 5}};
        double[] exprement = {1e4, 1e6, 1e8};
        double[] funcExp = {1, 0, 0};
        List<Double> integralRes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double sum = 0;
            double res = 1;
            for (int k = 0; k < 3; k++) {
                if (funcExp[k] == 0) {
                    res *= interval[k][1] - interval[k][0];
                } else {
                    for (int j = 0; j < (int) exprement[i]; j++) {
                        sum += Math.pow(interval[k][0] + (interval[k][1] - interval[k][0]) * Math.random(),
                                funcExp[k]);
                    }
                    res *= (interval[k][1] - interval[k][0]) * sum / (int) (exprement[i]);
                }
            }
            integralRes.add(res);
        }
        System.out.println("Результат вычислений");
        for (int i=0;i<integralRes.size();i++){
            System.out.println("f'"+(i+1)+" = "+ integralRes.get(i));
        }
        System.out.println();

        System.out.println("Разность модулей");
        System.out.println("|I1-I2| = " + (Math.abs(integralRes.get(0) - integralRes.get(1))));
        System.out.println("|I2-I3| = " + (Math.abs(integralRes.get(1) - integralRes.get(2))));
        System.out.println();
    }
}
