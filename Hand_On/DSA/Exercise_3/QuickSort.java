public class QuickSort {
    public static void quickSort(Order[] orders,int low,int high){
        if(low < high){
            int pivotIndex = partition(orders,low,high);
            quickSort(orders, low, pivotIndex-1);
            quickSort(orders, pivotIndex+1, high);
        }
    }    
    public static int partition(Order[] orders, int low,int high){
        double pivot= orders[high].getTotalPrice();
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(orders[j].getTotalPrice() < pivot){
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}


/*
    Time Complexity
        best -> O(nlogn)
        average -> O(nlogn)
        worst -> O(n^2)


    Quick sort is much better than bubble sort in terms of time complexity.
    for implementation bubble sort may look easier but for time complexity quicksort 
*/