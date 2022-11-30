import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Math.abs;

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
            case 5:
                break;
        }
    }


}
