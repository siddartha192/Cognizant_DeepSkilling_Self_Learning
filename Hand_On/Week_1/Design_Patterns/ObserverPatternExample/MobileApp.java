public class MobileApp implements Observer{
    
    @Override
    public void update(double stockPrice){
        System.out.println("Mobile App received update: stock price = "+stockPrice+"rupees");
    }
}