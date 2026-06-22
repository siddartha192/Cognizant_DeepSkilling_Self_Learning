public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img = new ProxyImage("Nature.png");
        System.out.println("Object Created Successsfully");
        System.out.println("\n First display: ");
        img.display();
        System.out.println();
        System.out.println("\n second display: ");
        img.display();

    }
}
