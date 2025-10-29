package JavaBasics;

import java.util.Scanner;

/*
Фибоначчи (итеративно)
long fib(int n) — fib(0)=0, fib(1)=1.
Проверь: n=0,1,2,10. Обсуди пределы long.
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter an integer for fibonacci number (must be between 1 and 92): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }

    static long fibonacci(int n){
        if (n <= 0 || n > 92) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
