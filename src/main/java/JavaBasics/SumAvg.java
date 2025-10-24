package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class  SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив целых чисел через запятую или пробел:");
        String line = sc.nextLine();

        int[] a = parseIntArray(line);           // парсим строку в int[]
        long sum = sum(a);                       // сумма делаем long на случай переполнения
        Double avg = average(a);                 // может быть null, если массив пустой

        System.out.println("Массив: " + Arrays.toString(a));
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (avg == null ? "n/a (пустой массив)" : avg));
    }

    static int[] parseIntArray(String line) {
        if (line == null) return new int[0];
        String timmed = line.trim();
        if (timmed.isEmpty()) return new int[0];

        String[] tokens = timmed.split("[,;\\s]+");

        int[] resalt = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            resalt[i] = Integer.parseInt(tokens[i]);
        }
        return resalt;
    }
    static long sum(int[] a) {
        long s = 0;
        for (int x : a) s+= x;
        return s;
    }

    static Double average(int[] a) {
        if (a.length == 0) return null;
        return sum(a) / (double) a.length;
    }
}