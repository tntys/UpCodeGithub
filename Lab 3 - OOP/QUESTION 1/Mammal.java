public class Mammal extends Animal {
    public Mammal(String name) {
        super(name); //call out the Animal class
    }

    @Override
    public String toString() {
        return "Mammle: " + super.toString() + " Animal name: " + getName(); //getName cause the name is a private attribute
    }
}