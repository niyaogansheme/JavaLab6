public class BoxTest {
    public static void main(String[] args) {
        Boxes box1 = new Boxes(4);
        Boxes box2 = new Boxes(7);

        System.out.println("Box 1 size: " + box1);
        box1.drawBox();

        System.out.println("\nBox 2 size: " + box2);
        box2.drawBox();
    }
}
