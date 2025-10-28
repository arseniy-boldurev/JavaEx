package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

/*
Сдвиг массива
rotateRight(int[] a, int k) — циклический сдвиг вправо на k.
Проверь: k больше длины, k=0, пустой массив.
 */
public class RotateRightArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Массив до сдвига: " + Arrays.toString(numbers));
        System.out.println("Введите шаг сдвига: ");
        int k = sc.nextInt();
        sc.close();
        numbers = rotateRight(numbers, k);

        System.out.println("Массив после сдвига: " + Arrays.toString(numbers));
    }
    public static int[] rotateRight(int[] a, int k){
        int temporary = a[a.length-1];
        int step = 1;
        for(int i = 1; i < a.length - 1 ; i++){
            a[a.length - i] = a[step++];
        }
        a[0] = temporary;
        return a;
    }
}
