package JavaBasics;

import java.util.Scanner;

/*
Количество цифр
int digitCount(int n) — 0 имеет 1 цифру.
Примеры: 0→1, 7→1, -123→3.

 */
public class DigitCount {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(digitCount(n));
    }
    static int digitCount(int n){
        int positive = Math.abs(n);
        String  digits = positive + "";
        return digits.length();
    }

}
