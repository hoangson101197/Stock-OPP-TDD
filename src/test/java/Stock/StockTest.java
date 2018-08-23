package Stock;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StockTest {

    @Test
    public void testChangePercent() {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.25;
        double expected = -0.72;
        double result = stock.getChangePercent();
        assertEquals(expected, result);
    }
}