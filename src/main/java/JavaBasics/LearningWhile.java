package JavaBasics;

import java.util.Scanner;

public class LearningWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter an integer");
            scanner.next();
        }

        int firstNumber = scanner.nextInt();

        System.out.println("Enter last number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter an integer");
            scanner.next();
        }
        int lastNumber = scanner.nextInt();

        if (firstNumber > lastNumber) {
            int t = firstNumber;
            firstNumber = lastNumber;
            lastNumber = t;

            System.out.println("Cheng first and last number");
        }

        while (firstNumber <= lastNumber) {
            System.out.printf("%d ", firstNumber++);
        }
        System.out.println();
    }
}
