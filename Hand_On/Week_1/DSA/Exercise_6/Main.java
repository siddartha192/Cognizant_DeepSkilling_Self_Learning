public class Main {
    public static void main(String[] args) {
        Book books[] = {
            new Book(1,"C++","Bjarne"),
            new Book(2,"Java","James Gosling"),
            new Book(3,"DBMS","Korth"),
            new Book(4,"Python","Guido")
        };
        String target = "Java";
        Book binaryRes = BinarySearch.binarySearch(books,target);
        Book linearRes = LinearSearch.linearSearch(books,target);
        System.out.println("Linear search Result: ");
        System.out.println(linearRes);
        System.out.println("Binary search Result: ");
        System.out.println(binaryRes);

    }
}
