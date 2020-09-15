/**
 * @program: homework_assignment_2
 * @filename: Animal
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public abstract class Animal {
    private String type;
    private String name;
    private int age;
    private String gender;
    private String environment;
    private double fast;

    public Animal(String type, String name, int age, String gender, String environment, double fast) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.fast = fast;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getFast() {
        return fast;
    }

    public void setFast(double fast) {
        this.fast = fast;
    }

    public abstract void move();
    public abstract void sound();
    public abstract void eat();
    public abstract void sleep();
}
