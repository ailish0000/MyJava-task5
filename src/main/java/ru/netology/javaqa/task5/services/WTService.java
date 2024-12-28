package ru.netology.javaqa.task5.services;

public class WTService {

    public int calcWork(int income, int expenses, int threshold) {
        int months = 0;
        int deposit = 0;

        for (int month = 1; month < 12; month++) {
            if (deposit >= threshold) {
                months++;
                deposit = (deposit - expenses) / 3;
            } else {
                deposit += income;
                deposit -= expenses;
            }
        }
        return months; // Возвращаем количество месяцев отдыха
    }
}



