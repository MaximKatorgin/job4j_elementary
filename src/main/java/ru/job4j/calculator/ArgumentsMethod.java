package ru.job4j.calculator;

public class ArgumentsMethod {

    public static void hello(String name, int age) {
        System.out.println(String.format("Hello, %s, age = %d", name, age));
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
    }
}
