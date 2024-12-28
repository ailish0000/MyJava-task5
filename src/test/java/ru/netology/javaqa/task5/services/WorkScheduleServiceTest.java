package ru.netology.javaqa.task5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkScheduleServiceTest {

    @Test
    void shouldCalculateThreeMonths() {
        WTService service = new WTService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calcWork(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateZeroMonths() {
        WTService service = new WTService();

        int income = 50_000;
        int expenses = 40_000;
        int threshold = 150_000;
        int expected = 0;

        int actual = service.calcWork(income, expenses, threshold);
        Assertions.assertEquals(expected, actual); // Проверяем результат
    }

    @Test
    void shouldCalculateFourMonths() {
        WTService service = new WTService();

        int income = 100_000;
        int expenses = 10_000;
        int threshold = 150_000;
        int expected = 4;

        int actual = service.calcWork(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}



