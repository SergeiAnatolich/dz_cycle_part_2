package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 180;

        double actual = service.calculateSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.calculateAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxMonthSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMaxMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinMonthSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateMinMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthUnderAverageSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthUnderAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOverAverageSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMonthOverAverageSales(sales);

        assertEquals(expected, actual);
    }
}