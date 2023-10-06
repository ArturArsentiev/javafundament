package com.softserve.edu03.pt.task1;

import java.util.Scanner;

public class Task1 {
    public static void main() {//Rename this method to something like t1()

        double firstNumber = getNumber("Enter the first number: ");

        double secondNumber = getNumber("Enter the second number: ");


        double total = getTotal(firstNumber, secondNumber);//Nice


        double average = getAverage(firstNumber, secondNumber);//Good

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + total);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double getTotal(double number1, double number2) {
        return number1 + number2;
    }
    public static double getAverage(double number1, double number2) {
        return (number1 + number2) / 2;
    }
}

