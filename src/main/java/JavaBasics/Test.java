package JavaBasics;
/*
Факториал (итеративно)
long fact(int n) — n>=0, для больших n объясни переполнение.
Проверь: 0! = 1, 1!, 10!.

 */
public class Test {
    public static void main(String[] args) {

    }
}


    /*  Rotate array
        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int step = 3;
        int[] newArr = new int[step];

        System.arraycopy(arr, arr.length - step, newArr, 0, newArr.length);

        for (int i = 0; i < arr.length - step; i++) {
            arr[arr.length - (1 + i)] = arr[arr.length - 1 - (step + i)];
        }

        System.arraycopy(newArr, 0, arr, 0, newArr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

    } */