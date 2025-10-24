package JavaBasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sensinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число для начала суммирования. Введите 0 для завершения: ");

        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число. Введите заново");
            sc.next();
        }

        int a = sc.nextInt();

        System.out.println("Напиши следующее число");

        while (true) {
            int b = sc.nextInt();
            a = a + b;
            System.out.println("Сумма: " + a);
            System.out.println("Следующее число: ");

            if (b == 0) {
                System.out.println("Вы завершили выполнение программы");
                break;
            }
        }

    }
}
