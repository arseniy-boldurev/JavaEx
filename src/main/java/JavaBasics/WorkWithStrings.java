package JavaBasics;

import java.util.Scanner;

public class WorkWithStrings {
    public static void main(String[] args) {
        System.out.println("Choose your task: \n Task 1: Word Counter\n Task 2: Space Normalizer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: System.out.println(wordCounter(getString())); break;
            case 2: System.out.println("Come back later"); break;
            default: System.out.println("Invalid input"); break;
        }

    }



    static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String yourText = sc.nextLine();
        sc.close();
        return yourText;
    }

    static int wordCounter(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        String[] words = s.split(" ");
        return words.length;
    }
}

