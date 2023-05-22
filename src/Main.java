public class Main {
    public class main {
        public static void main(String[] args) {
            StockAccount account = new StockAccount();

            account.buyStock("AAPL", "Apple Inc.", 150.0, 10);
            account.buyStock("GOOGL", "Alphabet Inc.", 2500.0, 5);
            account.buyStock("AMZN", "Amazon.com, Inc.", 3500.0, 3);

            account.displayStocks();

            account.updateStockPrice("AAPL", 160.0);
            account.sellStock("GOOGL");
            account.sellStock("MSFT");

            account.displayStocks();
        }
    }

}
