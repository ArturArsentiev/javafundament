package com.softserve.edu05.hw.Task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int question;

        do{
            System.out.println("Enter first number: ");
            int first = scan.nextInt();
            System.out.println("Enter second number: ");
            int second = scan.nextInt();
            int res = first + second;

            System.out.println("Sum of numbers: " + res);
            System.out.println("Do you want to continue, if so, press 1, if not, press 2");
            question = scan.nextInt();

        } while(question == 1);


    }
}