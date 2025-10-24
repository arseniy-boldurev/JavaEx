package JavaBasics;

import java.util.Arrays;
import java.util.Random;

public class ReversArray {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println(Arrays.toString(numbers));

        int j = 0;
        while (j < numbers.length / 2){
            int k = numbers[j];
            numbers[j] = numbers[numbers.length -1 - j];
            numbers[numbers.length - 1 - j] = k;
            j++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
