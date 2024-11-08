public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void greets();
    
}

// class Cat extends Animal {
//     public Cat (String name) {
//         super(name);
//     }

//     @Override
//     public void greets() {
//         System.out.print("Moew");
//     }
// }

// class Dog extends Animal {
//     public Dog (String name) {
//         super(name);
//     }

//     @Override
//     public void greets() {
//         System.out.print("Woof");
//     }

//     public void greets(Dog another) {
//         System.out.print("Wooooooof");
//     }
// }

// class BigDog extends Dog {
//     public BigDog(String name) {
//         super(name);
//     }

//     @Override
//     public void greets() {
//         System.out.print("Wooow");
//     }

//     @Override
//     public void greets(Dog another) {
//         System.out.print("Wooooooow");
//     }

//     public void greets(BigDog another) {
//         System.out.print("WOOOOOOW");
//     }
// }