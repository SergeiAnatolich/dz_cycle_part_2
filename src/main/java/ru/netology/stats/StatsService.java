package ru.netology.stats;

public class StatsService {
    public double calculateSumSales(double[] sales) {
        double sum = 0;
        for (double sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public double calculateAverageSales(double[] sales) {
        double averageSales = calculateSumSales(sales) / sales.length;
        return averageSales;
    }

    public int calculateMaxMonthSales(double[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateMinMonthSales(double[] sales) {
        int minMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthUnderAverageSales(double[] sales) {
        int amountMonth = 0;
        double averageSales = calculateAverageSales(sales);
        for (double sale : sales) {
            if (sale < averageSales) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int calculateMonthOverAverageSales(double[] sales) {
        int amountMonth = 0;
        double averageSales = calculateAverageSales(sales);
        for (double sale : sales) {
            if (sale > averageSales) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}
