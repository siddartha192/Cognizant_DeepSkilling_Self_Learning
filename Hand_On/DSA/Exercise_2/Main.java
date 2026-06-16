public class Main {
    public static void main(String[] args) {
        Product products[] = {
            new Product(101,"Laptop","Electronics"),
            new Product(102,"Mouse","Accessories"),
            new Product(103,"Keyboard","Accessories"),
            new Product(104,"Monitor","Accessories")
        };
        int target = 104;
        Product linear = LinearSearch.linearSearch(products,target);
        Product binary = BinarySearch.binarySearch(products,target);
        System.out.println("Linear Search Result");
        System.out.println(linear);
        System.out.println("Binary Search Result");
        System.out.println(binary);
    }
}
