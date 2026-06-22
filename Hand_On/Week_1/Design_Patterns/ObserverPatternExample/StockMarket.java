import java.util.*;
public class StockMarket implements Stock{
    List<Observer> observers = new ArrayList<>();
    double stockPrice;
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice){
        this.stockPrice = stockPrice;
        System.out.println("\n Stock Price Changed to "+stockPrice+"rupees. ");
        notifyObservers();
    }
}
