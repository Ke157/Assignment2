/**
 * @program: homework_assignment_2
 * @filename: EmployeeTest
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe", "Smith", 20, "A1234567890", "Bei jing Road 1", "M", 60.0, 1,"contractor", 60.0);
        Employee employee2 = new Employee("Lisa", "Gray", 21, "A1234567891", "Bei jing Road 2", "F", 61.0, 2,"full time", 110000.0);
        Employee employee3 = new Employee("Timothy", "Briggs", 22, "A1234567892", "Bei jing Road 3", "M", 62.0, 3,"full time", 80000.0);
        Employee employee4 = new Employee("George", "Wallace", 23, "A1234567893", "Bei jing Road 4", "M", 63.0, 4,"part time", 20.0);
        Employee employee5 = new Employee("Amy", "Student", 24, "A1234567894", "Bei jing Road 5", "F", 64.0, 5,"contractor", 45.0);
        employee1.introduce();
        System.out.println(employee1.calculatePay(30.0));
        System.out.println();
        employee2.introduce();
        System.out.println(employee2.calculatePay(2.0));
        System.out.println();
        employee3.introduce();
        System.out.println(employee3.calculatePay(4.0));
        System.out.println();
        employee4.introduce();
        System.out.println(employee4.calculatePay(25.0));
        System.out.println();
        employee5.introduce();
        System.out.println(employee5.calculatePay(45.0));
        System.out.println();


    }
}
