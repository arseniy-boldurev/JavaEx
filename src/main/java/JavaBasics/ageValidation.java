package JavaBasics;

import java.util.Scanner;

public class ageValidation {
    public static void main(String[] args){
        System.out.println("Введт свой возраст:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        while (age < 0 || age > 120){
            System.out.println("Не верю. Введи свой настоящий возраст: ");
            age = sc.nextInt();
        }
        System.out.println("Верю.Твой возраст может быть - " + age);
    }
}
