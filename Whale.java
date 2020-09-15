/**
 * @program: homework_assignment_2
 * @filename: Whale
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Whale extends Animal implements Swimmer{
    public Whale(String type, String name, int age, String gender, String environment, double fast) {
        super(type, name, age, gender, environment, fast);
        this.setEnvironment("ocean");
    }

    @Override
    public void move() {
        System.out.println("Whale " + getName() + " move.");
    }

    @Override
    public void sound() {
        System.out.println("Whale " + getName() + " sound.");
    }

    @Override
    public void eat() {
        System.out.println("Whale " + getName() + " eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Whale " + getName() + " sleep.");
    }

    @Override
    public void swim() {
        System.out.println("Whale " + getName() + " swim.");
    }
}
