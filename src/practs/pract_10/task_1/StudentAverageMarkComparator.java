package practs.pract_10.task_1;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageMark() > o2.getAverageMark()) {
            return 1;
        } else if (o1.getAverageMark() < o2.getAverageMark()) {
            return -1;
        } else {
            return 0;
        }
    }
}

