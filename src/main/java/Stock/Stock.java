package Stock;

import java.text.DecimalFormat;

public class Stock {
    //Stocks code
    String symbol;
    //Stock name
    String name;
    //Share price of the previous day
    double previousClosingPrice;
    //Current stock price
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        double changePercent = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        return Double.valueOf(decimalFormat.format(changePercent));
    }


}
