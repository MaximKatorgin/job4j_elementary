package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart10AndFinish20ThenSum165() {
        int start = 10;
        int finish = 20;
        int expected = 165;

        int sum = Counter.sum(start, finish);

        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart10AndFinish10ThenSum10() {
        int start = 10;
        int finish = 10;
        int expected = 10;

        int sum = Counter.sum(start, finish);

        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart15AndFinish10ThenSum0() {
        int start = 15;
        int finish = 10;
        int expected = 0;

        int sum = Counter.sum(start, finish);

        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStartMinus10AndFinish10ThenSum0() {
        int start = -10;
        int finish = 10;
        int expected = 0;

        int sum = Counter.sum(start, finish);

        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTwoToTwoThenTwo() {
        int start = 2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToTwelveThenTwo() {
        int start = -10;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

}