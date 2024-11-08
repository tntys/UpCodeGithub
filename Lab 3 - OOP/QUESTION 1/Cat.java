public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Moeww");
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}