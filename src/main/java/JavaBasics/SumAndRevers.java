package JavaBasics;

import java.util.Scanner;

public class SumAndRevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите целое положительное число");
        while(!sc.hasNextInt()){
            System.out.println("Пожалуйста введите ТОЛЬКО целое положительное число!");
            sc.next();
        }
        int a = sc.nextInt();
        while (a <= 0){
            System.out.println("Число обязано быть положительным. Повторите: ");
            while(!sc.hasNextInt()){
                System.out.println("Пожалуйста введите ТОЛЬКО целое положительное число!");
                sc.next();
            }
            a = sc.nextInt();

        }

        int n = a;
        int sum = 0;
        int rev = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit;
            rev = rev * 10 + digit;
            n /= 10;
        }

        System.out.println("Исходное число: " + a);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Реверс числа: " + rev);
    }
}
