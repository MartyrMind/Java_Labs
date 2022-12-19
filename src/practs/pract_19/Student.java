package practs.pract_19;

public class Student implements Comparable{

    private String name;
    private double averageMark;

    public Student(String name, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }


    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.averageMark > s.averageMark) {
            return -1;
        } else if (this.averageMark < s.averageMark) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new EmptyStringException("String is empty");
        }
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
