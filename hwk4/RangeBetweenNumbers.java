package hwk4;

import java.util.Scanner;

public class RangeBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scan.nextInt();

        System.out.print("Enter second number: ");
        int second = scan.nextInt();

        
        int start = Math.min(first, second) + 1;
        int end = Math.max(first, second);

        System.out.println("Even numbers between " + first + " and " + second + ":");
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}
