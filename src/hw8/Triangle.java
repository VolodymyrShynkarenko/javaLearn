package hw8;

class Triangle implements Shape {
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(getName());
    }
}