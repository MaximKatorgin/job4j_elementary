package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        System.out.println("Addition: " + add(firstNumber, secondNumber));
        System.out.println("Division: " + divide(6, 2));
        System.out.println("Subtraction: " + subtract(5, 2));
        System.out.println("Multiplication: " + multiply(4, 2));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }
}
