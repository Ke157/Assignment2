/**
 * @program: homework_assignment_2
 * @filename: AnimalTest
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog=new Dog("dog", "Tom", 1, "M", "home", 12.0);
        Cat cat = new Cat("cat", "Hello", 2, "M", "home", 10.0);
        Racoon racoon = new Racoon("racoon", "Jack", 3, "M", "forest", 5.0);
        Whale whale = new Whale("whale", "Rose", 4, "F", "ocean", 50.0);
        dog.bark();
        dog.eat();
        dog.move();
        dog.sleep();
        dog.sound();
        dog.walk();
        dog.greetHuman();
        System.out.println();
        cat.move();
        cat.sound();
        cat.eat();
        cat.sleep();
        cat.walk();
        cat.greetHuman();
        cat.scratch();
        System.out.println();
        racoon.move();
        racoon.sound();
        racoon.eat();
        racoon.sleep();
        racoon.scratch();
        System.out.println();
        whale.move();
        whale.sound();
        whale.eat();
        whale.sleep();
        whale.swim();
    }
}
