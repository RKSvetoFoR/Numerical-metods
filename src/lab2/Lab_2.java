package lab2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_2 {
    private static final LinkedList<Double> absValues = new LinkedList<>(List.of(0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0));
    private static final List<Double> ordValues = new ArrayList<>(List.of(2.0, 2.105, 2.221, 2.349, 2.491, 2.648, 2.822, 3.013, 3.225, 3.459, 3.718));

    private static final Double shift = absValues.get(1) - absValues.get(0);
    public static void print() {

        System.out.println("Test First Method Of Newton:");
        System.out.println(ordValues.get(1) + " = " + Lab_2_Interpolation.getResultOfNewtonFirstMethod(ordValues, absValues.getFirst(), absValues.get(1), shift));
        System.out.println(ordValues.get(8) + " = " + Lab_2_Interpolation.getResultOfNewtonFirstMethod(ordValues, absValues.getFirst(), absValues.get(8), shift));

        System.out.println();

        System.out.println("Test Second Method Of Newton:");
        System.out.println(ordValues.get(1) + " = " + Lab_2_Interpolation.getResultOfNewtonSecondMethod(ordValues, absValues.getLast(), absValues.get(1), shift));
        System.out.println(ordValues.get(8) + " = " + Lab_2_Interpolation.getResultOfNewtonSecondMethod(ordValues, absValues.getLast(), absValues.get(8), shift));

        System.out.println();

        System.out.println("Test First Method Of Gauss:");
        System.out.println(ordValues.get(5) + " = " + Lab_2_Interpolation.getResultOfGaussFirstMethod(ordValues, absValues.get(5), absValues.get(5), shift));

        System.out.println();

        System.out.println("Test Second Method Of Gauss:");
        System.out.println(ordValues.get(5) + " = " + Lab_2_Interpolation.getResultOfGaussSecondMethod(ordValues, absValues.get(5), absValues.get(5), shift));

        System.out.println();

        System.out.println("In point 0.453:");
        double value = 0.453;
        System.out.println(Lab_2_Interpolation.getResultOfNewtonFirstMethod(ordValues, absValues.getFirst(), value, shift));
        System.out.println(Lab_2_Interpolation.getResultOfNewtonSecondMethod(ordValues, absValues.getLast(), value, shift));
        System.out.println(Lab_2_Interpolation.getResultOfGaussFirstMethod(ordValues, absValues.get(5), value, shift));
        System.out.println(Lab_2_Interpolation.getResultOfGaussSecondMethod(ordValues, absValues.get(5), value, shift));

        System.out.println();

        System.out.println("In point 0.541:");
        System.out.println(Lab_2_Interpolation.getResultOfNewtonFirstMethod(ordValues, absValues.getFirst(), 0.541, shift));
        System.out.println(Lab_2_Interpolation.getResultOfNewtonSecondMethod(ordValues, absValues.getLast(), 0.541, shift));
        System.out.println(Lab_2_Interpolation.getResultOfGaussFirstMethod(ordValues, absValues.get(5), 0.541, shift));
        System.out.println(Lab_2_Interpolation.getResultOfGaussSecondMethod(ordValues, absValues.get(5), 0.541, shift));
    }

}
