package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void task() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("What is your name?");
            String name = br.readLine();
            System.out.println("Where do you live, " + name + "?");
            String address = br.readLine();
            System.out.println("Address: " + address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}