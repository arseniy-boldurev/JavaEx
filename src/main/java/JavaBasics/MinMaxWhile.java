package JavaBasics;

import java.util.Arrays;
import java.util.Random;

public class MinMaxWhile {
    public static void main(String[] args) {
        int[] N = new int[20];
        Random rand = new Random();
        int i = 0;
        int evenCount = 0;


        while (i < N.length) {
            N[i] = rand.nextInt(1000);
            i++;
        }

        i = 0;
        while (i < N.length) {
            if (N[i] % 2 == 0) {
                evenCount++;
            }
            i++;
        }

        int min = N[0];
        int max = N[0];
        i = 1;
        while (i < N.length) {
            int val = N[i];
            if (val < min) min = val;
            if (val > max) max = val;
            i++;
        }
        System.out.println("Массив: " + Arrays.toString(N));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Количество чётных = " + evenCount);
    }

    public static class WorkWithIndex {
        public static void main(String[] args) {
            int[] a = new int[] {5,1,4,2};
            System.out.println(Arrays.toString(a));
            SinglePass(a);
            System.out.println(Arrays.toString(a));
            bubbleSortEarlyExit(a);
            System.out.println(Arrays.toString(a));
        }

        public static boolean SinglePass(int[] a){
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            return false;
        }

        static void bubbleSortEarlyExit(int[] a) {
            if (a == null || a.length < 2) return;
            while (SinglePass(a)) {
                // ничего: крутим, пока singlePass возвращает true
            }
        }
    }

    public static class OneMoreTime {
        public static void main(String[] args) {
            int n = 30;
            int[] numbers = new int[n];
            Random rand = new Random();

            for (int i = 0; i < numbers.length-1; i++) {
                numbers[i] = rand.nextInt(1000);

            }

            System.out.println(Arrays.toString(numbers));

            int[] newNumbers = new int[n];
            int k = 0;
            for (int x : numbers) {
                if (x%2 == 0) {
                    newNumbers[k++] = x;
                }
            }

            System.out.println(Arrays.toString(Arrays.copyOf(newNumbers, k)));
        }
    }
}
