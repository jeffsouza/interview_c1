package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void operation(int value) {

        while (value > 1) {

            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = value * 3 + 1;
            }

            System.out.println(value);
        }

    }

    public static void operation2(int value) {

        if (value == 1) {
            return;
        }

        if (value % 2 == 0) {
            value /= 2;
        } else {
            value = value * 3 + 1;
        }
        System.out.println(value);

        operation2(value);

    }

    public static void main(String[] args) {

//        List<Integer> inputs = Arrays.stream(new Integer[] { 50, 100, 1000, 10000 }).collect(Collectors.toList());
//
//        for (Integer input : inputs) {
//            operation2(input);
//            System.out.println("-----");
//        }

        for (int i=1; i < 1000000; i++) {
            operation2(i);
        }

    }
}