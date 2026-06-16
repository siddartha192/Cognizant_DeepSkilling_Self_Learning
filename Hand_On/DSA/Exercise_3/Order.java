public class Order{
    final private int orderId;
    final private String customerName;
    final private double totalPrice;
    public Order(int orderId,String customerName,double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    @Override
    public String toString(){
        return "ID="+orderId+
                ", Name="+customerName+
                ", Price="+totalPrice;
    }
}