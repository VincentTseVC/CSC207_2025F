package week02.oopDemo;

public class Cat extends Mammal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name) {
        this(name, 1);
    }

    @Override
    public String speak() {
        return "喵～";
    }

    @Override
    public void nurse() {
        System.out.println("Come to Mommy~");
    }
}
