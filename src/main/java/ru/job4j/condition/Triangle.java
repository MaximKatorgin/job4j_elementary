package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ac + bc > ab && bc + ab > ac) {
            return true;
        }
        return false;
    }
}
