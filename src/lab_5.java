
import java.util.*;

public class lab_5 {
    static double f1(double x){
        return Math.sin(1/Math.pow(x,2));
    }
    static double f2(double x){
        return Math.log10(x)*Math.sin(1/Math.pow(x,3));
    }
    static double f3(double x){
        return Math.exp(2*x)*Math.cos(1/x);
    }
    static double f4(double x){
        return (Math.exp(x)/x)*Math.sin(1/Math.pow(x,3));
    }
    static double f5(double x){
        return (Math.pow(3,x)/Math.pow(x,2))*Math.log10(Math.pow(x,2));
    }
    static Map<String,List> midRect(){
        Map<String,List> result = new HashMap<>();
        result.put("Sin(1/x^2)",null);
        result.put("Ln(x)*Sin(1/x^3)",null);
        result.put("e^(2x)*cos(1/x)",null);
        result.put("e^x/x*Sin(1/x^3)",null);
        result.put("3^x/x^2*Ln(x^2)",null);
        List<Double> value = new ArrayList<>();
        int a = 3;
        int b = 5;
        value.add((b-a)*(f1(a)-f1(b))/2);
        a = 3;
        b = 4;
        value.set(0,(b-a)*(f2(a)-f2(b))/2);
        a = 1;
        b = 2;
        value.set(0,(b-a)*(f3(a)-f3(b))/2);
        a = 2;
        b = 3;
        value.set(0,(b-a)*(f4(a)-f4(b))/2);
        a = 2;
        b = 1;
        value.set(0,(b-a)*(f5(a)-f5(b))/2);
        return result;
    }
}
