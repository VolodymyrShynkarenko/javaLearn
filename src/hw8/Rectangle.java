package hw8;

class Rectangle implements Shape {
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(getName());
    }
}