public class BinarySearch {
    public static Book binarySearch(Book books[],String title){
        int left = 0;
        int right = books.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int res = books[mid].getTitle().compareToIgnoreCase(title);
            if(res == 0){
                return books[mid];
            }
            else if(res < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
