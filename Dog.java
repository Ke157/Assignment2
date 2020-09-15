/**
 * @program: homework_assignment_2
 * @filename: Dog
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Dog extends Animal implements Domesticated{
    public Dog(String type, String name, int age, String gender, String environment, double fast) {
        super(type, name, age, gender, environment, fast);
        this.setEnvironment("home");
    }

    public void bark() {
        System.out.println("dog " + getName() + " bark.");
    }

    @Override
    public void move() {
        System.out.println("dog " + getName() + " move.");
    }

    @Override
    public void sound() {
        System.out.println("dog " + getName() + " sound.");
    }

    @Override
    public void eat() {
        System.out.println("dog " + getName() + " eat.");
    }

    @Override
    public void sleep() {
        System.out.println("dog " + getName() + " sleep.");
    }

    @Override
    public void walk() {
        System.out.println("dog " + getName()+" walk.");
    }

    @Override
    public void greetHuman() {
        System.out.println("dog " + getName()+" greetHuman.");
    }

}
