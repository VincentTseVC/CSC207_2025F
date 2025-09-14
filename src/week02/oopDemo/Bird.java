package week02.oopDemo;

public class Bird extends Animal implements Flyable {

    @Override
    public String speak() {
        return "幾～";
    }

    @Override
    public int numberOfWings() {
        return 2;
    }
}
