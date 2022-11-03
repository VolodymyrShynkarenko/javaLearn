package hw8;

public class Circle implements Shape {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(getName());
    }
}
