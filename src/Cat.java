public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("moooo");
    }

    public Cat(String name, String type, int legs, int age) {
        super(name, type, legs, age);
    }
}
