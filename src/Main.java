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
            case 5:
                Map<String, List> temp = new HashMap<>();
                temp = lab_5.trapez();
                for (Map.Entry<String, List> pair : temp.entrySet()) {
                    System.out.println(pair.getKey() + pair.getValue());
                }
                break;
        }
    }


}
