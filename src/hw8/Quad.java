package hw8;

class Quad implements Shape {
    private String name;

    public Quad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(getName());
    }
}
