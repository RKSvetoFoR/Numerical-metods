//package lab13;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Lab_13 {
//    static List<Double> x = new ArrayList<>();
//    static List<Double> y = new ArrayList<>();
//    static double eps = 1e-4;
//    private static void rung3rd(double z0, double h, double b){
//        if (x != null && !x.isEmpty()) {
//            while (Math.abs(x.get(x.size() - 1) - b) > eps) {
//                double k1 = z0 * h;
//                double m1 = -Math.sin(y.get(y.size() - 1)) * h;
//                double k2 = (z0 + m1 / 2) * h;
//                double m2 = -Math.sin(y.get(y.size() - 1) + k1 / 2) * h;
//                double k3 = (z0 + 2 * m2 - m1) * h;
//                double m3 = -Math.sin(y.get(y.size() - 1) + 2 * k2 - k1) * h;
//                y.add(y.get(y.size() - 1) + 1 / 6 * (k1 + 4 * k2 + k3));
//                z0 += 1 / 6 * (m1 + 4 * m2 + m3);
//                x.add(x.get(x.size() - 1) + h);
//            }
//        }
//    }
//    public static void shootingMethod(){
//        double a = 0;
//        double b = 2;
//        double y0 = 0;
//        double y1 = Math.PI;
//        double h = 0.1;
//        x.add(a);
//        y.add(y0);
//        double alpha0 = Math.atan((y1-y0)/(b-a));
//        double z0 = Math.tan(y1-y0)/(b-a);
//        rung3rd(z0,h,b);
//        double check0 = y.get(y.size()-1);
//        if (Math.abs(y.get(y.size()-1))<eps){
//            try (FileWriter writer = new FileWriter("lab1.txt", false)) {
//                for (Double aDouble : y) {
//                    writer.write(String.valueOf(aDouble));
//                    writer.append('\n');
//                }
//                writer.flush();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }else{
//            double alpha1 = alpha0;
//            while ((y.get(y.size()-1)>y1)){
//                alpha1 /= 1.5;
//                z0 = Math.atan((alpha1));
//                x.clear();
//                x.add(a);
//                y.clear();
//                y.add(y0);
//                rung3rd(z0,h,b);
//            }
//            while (y.get(y.size()-1) < y1) {
//                alpha1 *= 1.5;
//                z0 = Math.tan(alpha1);
//                x.clear();
//                x.add(a);
//                y.clear();
//                y.add(y0);
//                rung3rd(z0, h, b);
//            }
//            //метод половниного деления для поиска
//            //_alpha в интервале (alpha0,alpha1)
//            while (Math.abs(y.get(y.size()-1)-y1)>eps){
//                double alpha2 = (alpha0 + alpha1) / 2;
//                double check1 = y.get(y.size()-1) - y1;
//                z0 = Math.tan(alpha2);
//                x.clear();
//                x.add(a);
//                y.clear();
//                y.add(y0);
//                rung3rd(z0,h, b);
//                double check2 = y.get(y.size()-1)-y1 - y1;
//                if (check0 * check2 < 0) {
//                    alpha1 = alpha2;
//                } else {
//                    alpha0 = alpha1;
//                    alpha1 = alpha2;
//                    check0 = check1;
//                }
//            }
//            double _alpha = (alpha0 + alpha1) / 2.0;
//            z0 = Math.tan(_alpha);
//            x.clear();
//            x.add(a);
//            y.clear();
//            y.add(y0);
//            rung3rd(z0,h, b);
//        }
//        try (FileWriter writer = new FileWriter("lab1.txt", false)) {
//            for (Double aDouble : y) {
//                writer.write(String.valueOf(aDouble));
//                writer.append('\n');
//            }
//            writer.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
