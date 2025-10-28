package JavaBasics;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int step = 3;
        int[] newArr = new int[step];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr.length - step + i];
            arr[arr.length - step + i] = 0; // необязательная хуйня. можно вырезать как всех учих. пойдет для наглядности
        }

        for (int i = 0; i < arr.length - step; i++) {
            arr[arr.length - (1 + i)] = arr[arr.length - 1 - (step + i)];
        }

        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

    }
}
