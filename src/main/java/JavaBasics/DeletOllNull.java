/*
Удалить все нули (сжатие)
compressZerosLeft(int[] a) — перенести все ненули влево, нули — вправо,
порядок ненулей сохранить.
Вернуть количество ненулей.
Пример: [0,3,0,2,5] → [3,2,5,0,0], вернуть 3.
 */

package JavaBasics;

import java.util.Arrays;

public class DeletOllNull {
    public static void main(String[] args){
        int[] numbers = {0,3,0,2,5,10,8,9,0,0,45};
        System.out.println("До: " + Arrays.toString(numbers));

        int nonZeroCount = compressZerosLeft(numbers);

        System.out.println("После: " + Arrays.toString(numbers));
        System.out.println("Ненулей: " + nonZeroCount);
        System.out.println("Нулей: " + (numbers.length - nonZeroCount));
    }

    static int compressZerosLeft(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[k++] = a[i];
            }
        }
        for (int j = k; j < a.length; j++) {
            a[j] = 0;
        }
        return k;
    }
}
