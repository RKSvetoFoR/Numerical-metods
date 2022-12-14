package lab2;

import java.util.ArrayList;
import java.util.List;

public class Lab_2_Interpolation {
    public static Double getResultOfNewtonFirstMethod(List<Double> ordValues, Double beginAbsValue, Double needValue, Double shift) {
        double value = (needValue - beginAbsValue) / shift;
        double sum = 0.0;
        int size = ordValues.size();
        double coefficient = 1.0;
        List<Double> listOfValues = getValuesForFirstMethodOfNewton(getMatrixOfFiniteDifferences(ordValues));

        for (int i = 0; i < size; i++) {
            sum += coefficient * listOfValues.get(i);
            coefficient *= (value - i) / (i + 1);
        }

        return sum;
    }

    private static List<Double> getValuesForFirstMethodOfNewton(Double[][] matrix) {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            list.add(matrix[i][i]);
        }

        return list;
    }

    public static Double getResultOfNewtonSecondMethod(List<Double> ordValues, Double endAbsValue, Double needValue, Double shift) {
        double value = (needValue - endAbsValue) / shift;
        double sum = 0.0;
        int size = ordValues.size();
        double coefficient = 1.0;
        List<Double> listOfValues = getValuesForSecondMethodOfNewton(getMatrixOfFiniteDifferences(ordValues));

        for (int i = 0; i < size; i++) {
            sum += coefficient * listOfValues.get(i);
            coefficient *= (value + i) / (i + 1);
        }

        return sum;
    }

    private static List<Double> getValuesForSecondMethodOfNewton(Double[][] matrix) {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            list.add(matrix[matrix.length - 1][i]);
        }

        return list;
    }

    public static Double getResultOfGaussFirstMethod(List<Double> ordValues, Double middleAbsValue, Double needValue, Double shift) {
        double value = (needValue - middleAbsValue) / shift;
        double sum = 0.0;
        int size = ordValues.size();
        double coefficient = 1.0;
        List<Double> listOfValues = getValuesForFirstMethodOfGauss(getMatrixOfFiniteDifferences(ordValues));

        for (int i = 0; i < size; i++) {
            sum += coefficient * listOfValues.get(i);
            coefficient *= (value - i) / (i + 1);
        }

        return sum;
    }

    private static List<Double> getValuesForFirstMethodOfGauss(Double[][] matrix) {
        int size = matrix.length;
        List<Double> list = new ArrayList<>();
        int pos = size - 1;
        int shift = 0;

        for (int j = 0; j < size; j++) {
            list.add(matrix[(int) Math.ceil(pos / 2.0) + shift][j]);

            shift++;
            pos--;
        }

        return list;
    }

    public static Double getResultOfGaussSecondMethod(List<Double> ordValues, Double middleAbsValue, Double needValue, Double shift) {
        double value = (needValue - middleAbsValue) / shift;
        double sum = 0.0;
        int size = ordValues.size();
        double coefficient = 1.0;
        List<Double> listOfValues = getValuesForSecondMethodOfGauss(getMatrixOfFiniteDifferences(ordValues));

        for (int i = 0; i < size; i++) {
            sum += coefficient * listOfValues.get(i);
            coefficient *= (value + i) / (i + 1);
        }

        return sum;
    }

    private static List<Double> getValuesForSecondMethodOfGauss(Double[][] matrix) {
        int size = matrix.length;
        List<Double> list = new ArrayList<>();
        int pos = size - 1;
        int shift = 0;

        for (int j = 0; j < size; j++) {
            list.add(matrix[(int) Math.floor(pos / 2.0) + shift][j]);

            shift++;
            pos--;
        }

        return list;
    }

    private static Double[][] getMatrixOfFiniteDifferences(List<Double> ordValues) {
        int size = ordValues.size();

        Double[][] matrixOfFiniteDifferences = new Double[size][size];

        for (int i = 0; i < size; i++) {
            matrixOfFiniteDifferences[i][0] = ordValues.get(i);
        }

        for (int i = 1; i < size; i++) {
            for (int j = i; j < size; j++) {
                matrixOfFiniteDifferences[j][i] = matrixOfFiniteDifferences[j][i - 1] - matrixOfFiniteDifferences[j - 1][i - 1];
            }
        }

        return matrixOfFiniteDifferences;
    }
}
