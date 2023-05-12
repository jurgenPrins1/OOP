public class Main {
    public static void main(String[] args) {
        Animal moo = new Cow("phil","the milk making kind",4,12);
        Cat cat = new Cat("satan","the void",4,12);
        Dog dog = new Dog("fido","the milk making kind",4,5);
        dog.makeSound();
        cat.makeSound();
        moo.makeSound();
    }

}