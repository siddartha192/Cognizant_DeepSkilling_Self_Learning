public class LinearSearch {
    public static Product linearSearch(Product[] products,int tar){
        for(Product product : products){
            if(product.getProductId() == tar) return product;
        }
        return null;
    }
}

/*
    Linear Search works irrespective of data order that is either sorted or unsorted .
    As it travel through out array using index values the time complexity is more comapred to Binary Search

    Time Complexities are 
        Best case -> O(1)
        Average Case -> O(n)
        Worst case -> O(n)
*/