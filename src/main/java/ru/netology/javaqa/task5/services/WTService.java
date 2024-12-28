package ru.netology.javaqa.task5.services;

public class WTService {

    public int calcWork(int income, int expenses, int threshold) {
        int months = 0; // Счётчик месяцев отдыха
        int deposit = 0; // Начальный депозит

        for (int month = 1; month < 12; month++) { // Цикл на 12 месяцев
            if (deposit >= threshold) { // Если достаточно денег для отдыха
                months++; // Увеличиваем счётчик месяцев отдыха
                deposit = (deposit - expenses) / 3; // Тратим треть депозита на отдых
            } else { // Если продолжаем работать
                deposit += income; // Добавляем доход за месяц
                deposit -= expenses; // Вычитаем обязательные траты
            }

            // Если депозит становится отрицательным, обнуляем его
            if (deposit < 0) {
                deposit = 0;
            }
        }

        return months; // Возвращаем количество месяцев отдыха
    }
}



