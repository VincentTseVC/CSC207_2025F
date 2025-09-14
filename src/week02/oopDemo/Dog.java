package week02.oopDemo;



public class Dog extends Mammal implements Fuckable {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        this(name, 1);
    }

    // Method Override
    public String eat(String food) {
        return "汪汪汪 好興奮! " + super.eat(food);
    }

    @Override
    public String speak() {
        return "汪～";
    }

    @Override
    public void nurse() {
        System.out.println("Shut up, and take my milk");
    }

    @Override
    public void makeLove() {

    }
}
