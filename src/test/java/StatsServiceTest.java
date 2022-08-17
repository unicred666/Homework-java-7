import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void test() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int actual = service.countBelowAvg(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
