public  abstract class Animal {
    protected String name;
    protected String type;
    protected int legs;
    protected int age;

    public abstract void makeSound();

    public Animal(String name, String type, int legs, int age) {
        this.name = name;
        this.type = type;
        this.legs = legs;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
