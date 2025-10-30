package JavaBasics;

import java.util.Scanner;

/*
Сумма цифр числа
int digitSum(int n) — для отрицательных возьми модуль.
Пример: -5029 → 16.
 */

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(digitSum(n));
    }
    static int digitSum(int n){
        int positiv = Math.abs(n);
        int sum = 0;
        while (positiv > 0){
            sum += positiv % 10;
            positiv /= 10;
        }
        return sum;
    }
}
