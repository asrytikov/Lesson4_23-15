package dz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. It's a calc");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a first decimal: ");
        int a = scanner.nextInt();
        System.out.println("Input a second decimal: ");
        int b = scanner.nextInt();

        System.out.printf("Sum a=%d and b=%d: %d \n",a, b, a+b);
        System.out.println("Its all. Thanks");

    }
}