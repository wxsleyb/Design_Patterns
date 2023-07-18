public class BridgeMain {
    public static void main(String[] args) {
        Shape triangleRed = new Triangle(new Red());
        Shape rectangleBlue = new Rectangle(new Blue());

        System.out.println(triangleRed.draw());
        System.out.println(rectangleBlue.draw());
    }
}