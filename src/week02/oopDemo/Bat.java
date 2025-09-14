package week02.oopDemo;

public class Bat extends Mammal implements Flyable, Fuckable {
    public Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public String speak() {
        return "Im batman";
    }

    @Override
    public void nurse() {

    }

    @Override
    public int numberOfWings() {
        return 2;
    }

    @Override
    public void makeLove() {

    }
}
