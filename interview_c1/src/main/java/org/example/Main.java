package org.example;

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

    public static void main(String[] args) {
        operation(50);
    }
}