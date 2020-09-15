import java.util.ArrayList;

/**
 * @program: homework_assignment_2
 * @filename: Student
 * @author: Ke Chen
 * @date: 2020/9/11
 * @description:
 **/
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private ArrayList<Course> courseArrayList;

    public class Course {
        private String name;
        private String startDay;
        private String endDay;
        private String startTime;
        private String endTime;


        public Course(String name, String startDay, String endDay, String startTime, String endTime) {
            this.name = name;
            this.startDay = startDay;
            this.endDay = endDay;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public void printSchedule() {
            System.out.println(String.format("%s %s/%s %s-%s", name, startDay, endDay, startTime, endTime));
        }
    }

    public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courseArrayList = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        this.courseArrayList.add(course);
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Course> getCourseArrayList() {
        return courseArrayList;
    }

    public void setCourseArrayList(ArrayList<Course> courseArrayList) {
        this.courseArrayList = courseArrayList;
    }

    public void display() {
        System.out.println("Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                '}');
        for(Course course: courseArrayList){
            course.printSchedule();
        }
    }
}
