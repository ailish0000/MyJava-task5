package ru.netology.javaqa.task5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkScheduleServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test.csv")

    void shouldCalculateMonths( int income, int expenses, int threshold, int expected) {
        WTService service = new WTService();

        int actual = service.calcWork(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}



