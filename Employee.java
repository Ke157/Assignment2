/**
 * @program: homework_assignment_2
 * @filename: Employee
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Employee extends Person {
    private int id;
    private String status;
    private Double basePay;

    public Employee(String firstName, String lastName, int age, String ssn, String address, String gender, Double weight, int id, String status, Double basePay) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    @Override
    public void introduce() {
        System.out.println("Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", socialSecurityNumber='" + getSsn() +
                ", address=" + getAddress() +
                ", gender=" + getGender() +
                ", weight=" + getWeight() +
                ", id=" + id +
                ", status=" + status +
                ", basePay=" + basePay +
                '}');
    }

    public Double calculatePay(Double unitsWorked) {
        if (status.equals("full time")) {
            return unitsWorked * basePay / 52.0;
        }
        if (status.equals("part time") || status.equals("contractor")) {
            return unitsWorked * basePay;
        }
        return 0.0;

    }
}
