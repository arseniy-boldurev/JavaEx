package JavaBasics;

import java.util.Scanner;

/*
Проверка простого числа
boolean isPrime(int n) — n>=2. Перебирай делители до √n.
Проверь: 2,3,4,17,18.
 */
public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if (n < 1) return false;
        return n % 2 == 0;
    }
}
