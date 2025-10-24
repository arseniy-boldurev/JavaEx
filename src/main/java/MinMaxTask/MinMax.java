package MinMaxTask;

public class MinMax {
    public static void main(String[] args) {
        int n = 100;
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Math.random();
        }
        double min = numbers[0];
        double max = numbers[0];
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            avg += numbers[i]/numbers.length;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("avg = " + avg);
    }
}
