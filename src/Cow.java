public class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    public Cow(String name, String type, int legs, int age) {
        super(name, type, legs, age);
    }
}
