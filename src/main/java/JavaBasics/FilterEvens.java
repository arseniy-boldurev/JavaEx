package JavaBasics;

import java.util.Arrays;
import java.util.Random;

/*
Копия только чётных
int[] filterEvens(int[] a) — вернуть новый массив только с чётными (порядок сохранить).
Подсказка: сначала посчитать размер, затем создать.
*/

public class FilterEvens  {
    public static void main(String[] args) {
        int n = 10;
        FilterEvens ArrayOps = null;
        int[] numbers = generateRandomNumbers(n);

        int evenCount = countEvens(numbers);
        int[] evens   = filterEvens(numbers, evenCount);

        System.out.println("Исходный: " + Arrays.toString(numbers));
        System.out.println("Чётные:   " + Arrays.toString(evens));
    }

    private static int[] generateRandomNumbers(int n){
        Random random = new Random();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) numbers[i] = random.nextInt(100);
        return numbers;
    }

    static int countEvens(int[] numbers) {
        int counter = 0;
        for (int x : numbers) {
            if (x % 2 == 0) counter++;
        }
        return counter;
    }

    static int[] filterEvens(int[] a, int evenCount) {
        int[] evens = new int[evenCount];
        int k = 0;
        for (int x : a) {
            if ((x & 1) == 0) {
                evens[k++] = x;
            }
        }
        return evens;
    }
}


//public class FilterEvens {
//    public static void main(String[] args) {
//        int n =10;
//        int evenCounter = 0;
//        int[] numbers = new int[n];
//        Random rand = new Random();
//        for (int i = 0; i < n; i++) {
//            numbers[i] = rand.nextInt(100);
//            if (numbers[i] % 2 == 0) {
//                evenCounter++;
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//        int[] evenNumbers = new int[evenCounter];
//
//        for (int i= 0, k = 0; i < n; i++) {
//            if (numbers[i] % 2 == 0) {
//                evenNumbers[k] = numbers[i];
//                k++;
//            }
//        }
//
//        System.out.println(Arrays.toString(evenNumbers));
//
//    }
//
//}

/*
public class filterEvens {
    public static void main(String[] args) {
        int n = 5;
        int[] ollNumbers = new int[n];
        int[] onlyEvenNumbers = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ollNumbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(ollNumbers));

        for (int i = 0; i < n; i++) {
            if (ollNumbers[i] % 2 == 0) {
                onlyEvenNumbers[i] = ollNumbers[i];
            }
        }
        System.out.println(Arrays.toString(onlyEvenNumbers));
    }

}
*/