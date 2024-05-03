package ru.job4j.calculator;

public class Fit {

    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_MULTIPLIER = 1.15;

    /**
     * Рассчитывает идеальный вес для мужчин.
     * @param height Рост в сантиметрах.
     * @return Идеальный вес.
     */
    public static double calculateManWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_MULTIPLIER;
    }

    /**
     * Рассчитывает идеальный вес для женщин.
     * @param height Рост в сантиметрах.
     * @return Идеальный вес.
     */
    public static double calculateWomanWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_MULTIPLIER;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = calculateManWeight(height);
        double woman = calculateWomanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
