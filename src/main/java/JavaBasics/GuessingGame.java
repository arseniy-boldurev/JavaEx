package JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int a =  1 + rand.nextInt(100);
        System.out.println(a);

        System.out.println("Угадай чило от 1 до 100");
        int b = scanner.nextInt();

        while(a != b){
            System.out.println("Попробуй еще: ");
            scanner.next();
        }

    }
}
