
import java.util.HashMap;
public class InventoryManager {
final private HashMap<Integer, Product> inventory;
    public InventoryManager(){
        inventory = new HashMap<>();
    }
    public void addProduct(Product product){
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added");
    }

    public void updateProduct(int id, String name,int quantity, double price){
        Product p = inventory.get(id);

        if(p != null){
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product Updated");
        }
        else{
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(int id){
        if(inventory.remove(id) != null){
            System.out.println("Product Deleted");
        }
        else{
            System.out.println("Product Not Found");
        }
    }

    public void displayProducts(){
        for(Product p: inventory.values()){
            System.out.println(p);
        }
    }
}
