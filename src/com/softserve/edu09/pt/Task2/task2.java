package com.softserve.edu09.pt.Task2;

import java.util.*;

public class task2 {
    public static void task2() {

        Set<Integer> set = new HashSet<>();

        var scan = new Scanner(System.in);

        String line = scan.nextLine();
        String[] token = line.split(",");
        for (var element : token) {
            set.add(Integer.parseInt(element));

        }
        System.out.println(set);

    }
}