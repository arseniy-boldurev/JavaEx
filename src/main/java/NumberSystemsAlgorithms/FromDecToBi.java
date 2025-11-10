package NumberSystemsAlgorithms;

import java.util.Scanner;

public class FromDecToBi {
    public static void main(String[] args) {
        System.out.println("Enter your decimal number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        convertToBinaric(num);
        System.out.println("The binary number is: " + convertToBinaric(num));
    }

    static String convertToBinaric(int num) {
        String remainder = "";

        if (num == 0){
            return "0";
        }

        while (num >= 1) {
            remainder = remainder + num % 2;
            num /= 2;
        }
        return new StringBuilder().append(remainder).reverse().toString();
    }
}
