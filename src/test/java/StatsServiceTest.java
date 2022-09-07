import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18);
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.average(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthPeakSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonht = service.maxSales(month);
        Assertions.assertEquals(expectedMonth, actualMonht);
    }

    @Test
    public void numberMonthsMinSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.numberMonthsMinSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void numberMonthsMaxSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.numberMonthsMaxSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}


