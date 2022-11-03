package hw8;

public class AppStarter {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        circle.display();
        Shape quad = new Quad("Quad");
        quad.display();
        Shape triangle = new Triangle("Triangle");
        triangle.display();
        Shape rectangle = new Rectangle("Rectangle");
        rectangle.display();
        Shape hexagon = new Hexagon("Hexagon");
        hexagon.display();
    }
}
