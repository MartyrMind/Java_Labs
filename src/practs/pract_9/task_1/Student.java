package practs.pract_9.task_1;

public class Student implements Comparable {
    private String name;
    private int age;
    private int iDNumber;

    public Student(String name, int age, int iDNumber) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.iDNumber > student.iDNumber) {
            return 1;
        } else if (this.iDNumber < student.iDNumber) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + iDNumber +
                '}';
    }
}
