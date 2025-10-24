package JavaBasics;

import java.util.Arrays;
import java.util.Random;

public class MinMaxIndex {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(10);
        }

        int min = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("This is the minimum value is " + min + "\n and maximum value is " + max);
    }
}
