package JavaBasics;
/*
Факториал (итеративно)
long fact(int n) — n>=0, для больших n объясни переполнение.
Проверь: 0! = 1, 1!, 10!.
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (must be a positive integer n>=0):");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of number = " + factorial(n));
    }
    static long factorial(int n){
        if (n > 20){
            return 1;
        }
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
