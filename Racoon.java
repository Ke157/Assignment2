/**
 * @program: homework_assignment_2
 * @filename: Racoon
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Racoon extends Animal implements Scratcher {

    public Racoon(String type, String name, int age, String gender, String environment, double fast) {
        super(type, name, age, gender, environment, fast);
        this.setEnvironment("forest");
    }

    @Override
    public void move() {
        System.out.println("Racoon " + getName() + " move.");
    }

    @Override
    public void sound() {
        System.out.println("Racoon " + getName() + " sound.");
    }

    @Override
    public void eat() {
        System.out.println("Racoon " + getName() + " eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Racoon " + getName() + " sleep.");
    }
    @Override
    public void scratch() {
        System.out.println("Racoon " + getName() + " scratch.");
    }
}
