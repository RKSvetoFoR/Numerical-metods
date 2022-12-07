import lab2.Lab_2;
import lab1.lab_1;
import lab3.Lab_3;
import lab5.lab_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер лабораторной работы");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        switch (k) {
            case 1:
                System.out.println("Если вы хотите использловать Интерполяционный многочлен Лагранжа нажмите 1,иначе нажмите 2");
                int c = sc.nextInt();
                if (c == 1) {
                    System.out.println(lab_1.lagrang());
                } else {
                    System.out.println(lab_1.aitken());
                }
                break;
            case 2:
                Lab_2.print();
                break;
            case 3:
                ArrayList<Double> temp3 = new ArrayList<>();
                temp3 = Lab_3.splines();
                for (int i = 0; i < temp3.size(); i++) {
                    System.out.print(temp3.get(i) + ",");
                }
            case 5:
                Map<String, List> temp5 = new HashMap<>();
                temp5 = lab_5.trapez();
                for (Map.Entry<String, List> pair : temp5.entrySet()) {
                    System.out.println(pair.getKey() + pair.getValue());
                }
                break;
        }
    }
}
