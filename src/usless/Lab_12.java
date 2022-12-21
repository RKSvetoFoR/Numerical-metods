//package usless;
//
//import sun.font.LayoutPathImpl;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.io.File;
//
//import static sun.font.LayoutPathImpl.getPath;
//
//public class Lab_12 {
//    public static void sweepMethod() throws RuntimeException {
//        int n = 1000;
//        double h = 1.0 / n;
//        double yStart = 1.0;
//        double yEnd = 1.0 / 3;
//        ArrayList<Double> x = new ArrayList<>();
//        double i = 0;
//        while (i < 1 + h) {
//            x.add(i);
//            i += h;
//        }
//        double[][] matrix = new double[n][n];
//        double[] y = new double[n];
//        for (int j = 1; j < n - 1; j++) {
//            matrix[j][j] = -2;
//            matrix[j - 1][j] = 1;
//            matrix[j][j - 1] = 1;
//        }
//        matrix[0][0] = 1;
//        matrix[0][1] = 0;
//        matrix[n - 2][n - 1] = 1;
//        matrix[n - 1][n - 1] = yEnd;
//        for (int j = 1; j < n - 1; j++) y[j] = x.get(j) * Math.pow(h, 2);
//        y[0] = yStart;
//        y[n - 1] = yEnd;
//
//        double[] alpha = new double[n];
//        double[] beta = new double[n];
//        double temp;
//
//        temp = matrix[0][0];
//        alpha[0] = -matrix[0][1] / temp;
//        beta[0] = y[0] / temp;
//
//        for (int j = 1; j < n - 1; j++) {
//            temp = matrix[j][j] + matrix[j][j - 1] * alpha[j - 1];
//            alpha[j] = -matrix[j][j + 1] / temp;
//            beta[j] = (y[j] - matrix[j][j - 1] * beta[j - 1]) / temp;
//        }
//        double[] values = new double[n];
//        values[n - 1] = beta[n - 1];
//
//        for (int j = n - 2; j >= 0; j--) {
//            values[j] = alpha[j] * values[j + 1] + beta[j];
//        }
//        System.out.println(Arrays.toString(values));
//        File file= new File("lab1.txt");
//        try (FileWriter writer = new FileWriter(file.getPath(), false)) {
//            for (int j = 0; j < n; j++) {
//                writer.write(String.valueOf(values[j]));
//                writer.append('\n');
//            }
//            writer.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
