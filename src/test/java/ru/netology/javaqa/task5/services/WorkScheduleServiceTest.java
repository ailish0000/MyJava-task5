package ru.netology.javaqa.task5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkScheduleServiceTest {

    @Test
    void shouldCalculateThreeMonths() {
        WTService service = new WTService();

        int income = 10_000; // Доход за месяц
        int expenses = 3_000; // Ежемесячные расходы
        int threshold = 20_000; // Порог депозита для отдыха
        int expected = 3; // Ожидаемое количество месяцев отдыха

        int actual = service.calcWork(income, expenses, threshold); // Фактический результат

        Assertions.assertEquals(expected, actual); // Проверяем результат
    }

    @Test
    void shouldCalculateTwoMonths() {
        WTService service = new WTService();

        int income = 50_000; // Доход за месяц
        int expenses = 40_000; // Ежемесячные расходы
        int threshold = 150_000; // Порог депозита для отдыха
        int expected = 0; // Ожидаемое количество месяцев отдыха

        int actual = service.calcWork(income, expenses, threshold); // Фактический результат

        Assertions.assertEquals(expected, actual); // Проверяем результат
    }

    @Test
    void shouldCalculateFourMonths() {
        WTService service = new WTService();

        int income = 100_000; // Доход за месяц
        int expenses = 10_000; // Ежемесячные расходы
        int threshold = 150_000; // Порог депозита для отдыха
        int expected = 4; // Ожидаемое количество месяцев отдыха

        int actual = service.calcWork(income, expenses, threshold); // Фактический результат

        Assertions.assertEquals(expected, actual); // Проверяем результат
    }
}



