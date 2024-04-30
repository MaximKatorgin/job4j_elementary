package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfSubtractionAndDivision(double first, double second) {
        return sum(subtract(first, second), divide(first, second));
    }

    public static double sumOfOperations(double first, double second) {
        return sum(
                sum(
                        subtract(first, second), sum(first, second)),
                sum(
                        divide(first, second), multiply(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfOperations(15, 30));
        System.out.println("Результат расчета равен: " + sumOfSubtractionAndDivision(20, 20));
    }
}
