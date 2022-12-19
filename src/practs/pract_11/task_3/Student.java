package practs.pract_11.task_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private String surname;
    private Date birthDate;

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        if (randomNum == 0) {
            return name + " " + surname + " " + new SimpleDateFormat("dd.MM.yyyy").format(birthDate);
        } else if (randomNum == 1) {
            return name + " " + surname + " " + new SimpleDateFormat("dd.MM.yyyy HH:mm").format(birthDate);
        } else {
            return name + " " + surname + new SimpleDateFormat("dd MMMM yy").format(birthDate);
        }
    }
}
