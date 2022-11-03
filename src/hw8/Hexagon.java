package hw8;

class Hexagon implements Shape {
    private String name;

    public Hexagon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(getName());
    }
}

