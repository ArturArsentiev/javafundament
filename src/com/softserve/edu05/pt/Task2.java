package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {

    public static void run() {
        System.out.print("Enter positive integer number: ");
        Scanner console = new Scanner(System.in);
        int enteredNumber = console.nextInt();
        console.nextLine();
        boolean isPrime = true;
        for (int i = 2; i <= enteredNumber / 2; i++) {
            if (enteredNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.printf(isPrime ? "Is a prime number" : "Is not prime number");
    }
}
