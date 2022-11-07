import com.javier.animales.*;

public class Main {
    public static void main(String[] args) {

        AnimalPrinter animalPrinter = new AnimalPrinter();
        Dog dog = new Dog();
        dog.setName("Perrete");
        dog.setAge(15);

        animalPrinter.printAnimal(dog);




    }
}