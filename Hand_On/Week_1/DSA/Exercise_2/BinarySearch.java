
public class BinarySearch {
    public static Product binarySearch(Product[] products,int targetId){
        int left = 0;
        int right = products.length;
        while(left <= right){
            int mid = (left+right)/2;
            if(products[mid].getProductId() == targetId) return products[mid];
            else if(products[mid].getProductId() < targetId) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
/*
    Binary Search works only on Sorted data 
    as data is sorted according to productId it worked here otherwise,
    we need to sort them using sorting technologies or built in methods

    It is faster for larger value because it reduces search space by half in each step.

    
    Time Complexities are 
        Best case -> O(1)
        Average Case -> O(logn)
        Worst case -> O(logn)
*/