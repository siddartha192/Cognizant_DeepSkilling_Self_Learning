public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobileapp =new MobileApp();
        Observer webapp =new WebApp();

        stockMarket.registerObserver(mobileapp);
        stockMarket.registerObserver(webapp);

        stockMarket.setStockPrice(3500);
        stockMarket.setStockPrice(3600);

        stockMarket.deregisterObserver(webapp);
        stockMarket.setStockPrice(3700);
    }
}
