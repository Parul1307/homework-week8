package inheritanceAndPolymorphism;

public class OOpsTest {
    public static void main(String[] args) {
        System.out.println("Animal");
        Animal a = new Animal();
        a.eat();

        System.out.println("Horse");
        Horse h = new Horse();
        h.walk();
        h.eat();

        System.out.println("Chicken");
        Chicken c = new Chicken();
        c.Walk();
        c.eat();

    }
}
