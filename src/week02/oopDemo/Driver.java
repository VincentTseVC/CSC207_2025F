package week02.oopDemo;

import javax.management.ObjectName;

public class Driver {

    public static void main(String[] args) {
        Dog eddy = new Dog("Eddy", 3); // enstantiate
        eddy.setName("Eddie");
        System.out.println(eddy.getName());
        System.out.println(eddy.numberOfAnimals); // 1
        System.out.println(Animal.numberOfAnimals); // 1

        Cat kathryn = new Cat("Kathryn");
        System.out.println(eddy.numberOfAnimals);    // 2
        System.out.println(kathryn.numberOfAnimals); // 2
        System.out.println(Animal.numberOfAnimals);  // 2

        System.out.println(eddy.eat("💩"));
        System.out.println(kathryn.eat("🐟"));

        System.out.println(eddy);
        // --------------------
        // reference Type = actual Object
        Dragonfly d1 = new Dragonfly();
        d1.numberOfWings();
        Insect d2 = new Dragonfly();
        // d2.numberOfWings()
        ((Dragonfly) d2).numberOfWings();
        ((Flyable) d2).numberOfWings();

        Flyable d3 = new Dragonfly();
        // d3.numberOfLegs();           // Compile Time Error
        ((Insect) d3).numberOfLegs();
        ((Dragonfly) d3).numberOfLegs();


        // ((Flyable) eddy).numberOfWings(); // Runtime Error

        Owner vc = new Owner();
        vc.addPet(eddy);
        vc.addPet(kathryn);

        vc.whatIHave();

    }
}
