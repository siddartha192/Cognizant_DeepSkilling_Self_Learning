public class Main{
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1,"Siddhu",10000),
            new Order(2,"Santhosh",12000),
            new Order(3,"Shiva",13000),
            new Order(4,"Praneeth",10000)
        };
        QuickSort.quickSort(orders,0,orders.length-1);
        System.out.println("Sorted Using QuickSort");
        for(Order order:orders){
            System.out.println(order);
        }
        BubbleSort.bubbleSort(orders);
        System.out.println("Sorted Using BubbleSort");
        for(Order order:orders){
            System.out.println(order);
        }
    }
}