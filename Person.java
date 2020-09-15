/**
 * @program: homework_assignment_2
 * @filename: Person
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private Double weight;

    public Person(String firstName, String lastName, int age, String ssn, String address, String gender, Double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", socialSecurityNumber='" + ssn + '\'' +
                ", address=" + address +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void introduce(){
        System.out.println(toString());
    }
}
