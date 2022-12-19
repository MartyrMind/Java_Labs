package practs.pract_9.task_4;

public class Student implements MyComparable {

    private String name;
    private double mark;

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int myCompareTo(Object o) {
        Student student = (Student) o;
        if (this.mark > student.mark) {
            return 1;
        } else if (this.mark < student.mark) {
            return -1;
        } else {
            return 0;
        }
    }
}
