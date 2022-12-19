package practs.pract_9.task_3;

public class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.age > student.age) {
            return 1;
        } else if (this.age < student.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
