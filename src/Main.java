import lab2.Lab_2;
import lab1.Lab_1;
import lab3.Lab_3;
import lab5.Lab_5;
import lab6.Lab_6;
import lab7.Lab_7;
import lab4.Lab_4;
import lab7.Lab_7_additional;

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
                    Lab_1.lagrang();
                } else {
                    Lab_1.aitken();
                }
                break;
            case 2:
                Lab_2.print();
                break;
            case 3:
                Lab_3.splines();
                break;
            case 4:
                Lab_4.leastSquares();
                break;
            case 5:
                Lab_5.trapez();
                break;
            case 6:
                Lab_6.gauss1();
                Lab_6.gauss2();
                break;
            case 7:
                Lab_7.monteKarlo();
                Lab_7_additional.monteKarlo();
                Lab_7_additional.res();
                break;
        }
    }
}
