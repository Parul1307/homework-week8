package inheritanceAndPolymorphism;

public class Chicken extends Animal {
    public void Walk() {
        System.out.println("Walks on 2 legs");
    }

    @Override
    public void eat() {
        System.out.println();
    }
}


