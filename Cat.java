/**
 * @program: homework_assignment_2
 * @filename: Cat
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Cat extends Animal implements Domesticated, Scratcher {

    public Cat(String type, String name, int age, String gender, String environment, double fast) {
        super(type, name, age, gender, environment, fast);
        this.setEnvironment("home");
    }

    @Override
    public void move() {
        System.out.println("cat " + getName() + " move.");
    }

    @Override
    public void sound() {
        System.out.println("cat " + getName() + " sound.");
    }

    @Override
    public void eat() {
        System.out.println("cat " + getName() + " eat.");
    }

    @Override
    public void sleep() {
        System.out.println("cat " + getName() + " sleep.");
    }

    @Override
    public void walk() {
        System.out.println("cat " + getName() + " walk.");
    }

    @Override
    public void greetHuman() {
        System.out.println("cat " + getName() + " greetHuman.");
    }

    @Override
    public void scratch() {
        System.out.println("cat " + getName() + " scratch.");
    }
}
