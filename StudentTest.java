
/**
 * @program: homework_assignment_2
 * @filename: StudentTest
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student johnSmith = new Student("John", "Smith", 20, (float) 3.6, "Computer Science", "School of Computer Science");
        Student.Course course1 =  johnSmith.new Course("CS151", "Tue", "Thur","6", "7:15");
        Student.Course course2 =  johnSmith.new Course("Eng101", "Mon", "Wed","10", "11:15");
        Student.Course course3 =  johnSmith.new Course("Hist100", "Tue", "Thur","1:30", "2:45");
        johnSmith.addCourse(course1);
        johnSmith.addCourse(course2);
        johnSmith.addCourse(course3);
        johnSmith.display();

    }
}
