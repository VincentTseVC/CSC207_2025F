package week02.oopDemo;

public abstract class Mammal extends Animal {

    public Mammal(String name, int age) {
        super(name, age);
    }

    public abstract void nurse();
}
