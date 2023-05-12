import java.util.PrimitiveIterator;

public class Dog extends Animal {

    private String woof;

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public Dog(String name, String type, int legs, int age) {
        super(name, type, legs, age);
        woof = name;
    }
}
