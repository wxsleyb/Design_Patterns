public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Desenhando um retângulo. " + color.fill();
    }
}
