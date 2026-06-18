public class Main{
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product(101,"Laptop",10,50000));
        manager.addProduct(new Product(102,"Mouse",50,800));
        manager.displayProducts();
        manager.updateProduct(101,"Gaming Laptop" , 15, 75000);
        System.out.println("Final Inventory");
    }
}