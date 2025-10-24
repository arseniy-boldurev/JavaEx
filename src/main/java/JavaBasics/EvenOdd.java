package JavaBasics;

import java.util.Arrays;
import java.util.Random;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 20;
        int[] numbers = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(100);
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("Дано масиив: " + Arrays.toString(numbers));
        System.out.println("Четных чисел: " + evenCount);
        System.out.println("Нечетных чисел: " + oddCount);
    }
}
