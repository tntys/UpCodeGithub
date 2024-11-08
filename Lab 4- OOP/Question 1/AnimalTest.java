import java.util.Scanner;;

public class AnimalTest {
    public static void main(String[] args) {

        // TESTING
        // Cat cat = new Cat("Doraemon");
        // Dog dog = new Dog("Ben");
        // BigDog bigDog = new BigDog("Gau");

        // cat.greets();
        // dog.greets();
        // dog.greets();

        // dog.greets(dog);
        // dog.greets(bigDog);
        // bigDog.greets(bigDog);
        // bigDog.greets(dog);

        Scanner scanner = new Scanner(System.in);
        //Cat
        System.out.println("Enter the Cat's name: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);
        System.out.println();
        //Dog
        System.out.println("Enter the Dog's name: ");
        String dogName = scanner.nextLine();
        Dog dog = new Dog(dogName);
        System.out.println();
        //BigDog
        System.out.println("Enter the Big Dog's name: ");
        String bigDogName = scanner.nextLine();
        BigDog bigDog = new BigDog(bigDogName);
        System.out.println();

        // Greets
        System.out.print(cat.getName() + " is greeting! ");
        cat.greets();

        System.out.print("\n"+dog.getName() + " is greeting!");
        dog.greets();

        System.out.print("\n"+dog.getName() + " is greeting!");
        dog.greets(dog);

        System.out.print("\n"+bigDog.getName() + " is greeting!");
        bigDog.greets();

        System.out.print("\n"+bigDog.getName() + " is greeting!");
        bigDog.greets(dog);

        System.out.print("\n"+bigDog.getName() + " is greeting!");
        bigDog.greets(bigDog);

        scanner.close();

    }
}


