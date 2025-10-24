package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class StringNormalizer {
    public static void main(String[] args) {
        System.out.println("Введите свое имя:");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        fullName = fullName.trim().replaceAll("\\s+", " ");

        System.out.println("Я узнал тебя: " + Arrays.toString(fullName.split(" ")));
    }
}
