import java.util.ArrayList;
import java.util.List;

class StockAccount {
    private List<Stock> stocks;

    public StockAccount() {
        stocks = new ArrayList<>();
    }

    public void buyStock(String symbol, String name, double price, int quantity) {
        Stock stock = new Stock(symbol, name, price, quantity);
        stocks.add(stock);
        System.out.println("Bought stock: " + stock);
    }

    public void sellStock(String symbol) {
        Stock stockToRemove = null;
        for (Stock stock : stocks) {
            if (stock.getSymbol().equals(symbol)) {
                stockToRemove = stock;
                break;
            }
        }
        if (stockToRemove != null) {
            stocks.remove(stockToRemove);
            System.out.println("Sold stock: " + stockToRemove);
        } else {
            System.out.println("Stock with symbol " + symbol + " not found.");
        }
    }

    public void updateStockPrice(String symbol, double newPrice) {
        for (Stock stock : stocks) {
            if (stock.getSymbol().equals(symbol)) {
                stock.setPrice(newPrice);
                System.out.println("Updated stock price: " + stock);
                return;
            }
        }
        System.out.println("Stock with symbol " + symbol + " not found.");
    }

    public void displayStocks() {
        System.out.println("Stocks in the account:");
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }
}