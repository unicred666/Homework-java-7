public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numberMonthsMinSales(long[] sales) {
        int numbMonthMin = 0;
        long avr = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avr) {
                numbMonthMin = numbMonthMin + 1;
            }
        }
        return (int) numbMonthMin;
    }

    public int numberMonthsMaxSales(long[] sales) {
        int numbMonthMax = 0;
        long avr = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avr) {
                numbMonthMax = numbMonthMax + 1;
            }
        }
        return numbMonthMax;
    }
}
