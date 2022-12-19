package practs.pract_13.task_2;

public class Person {
    private String name  = "";
    private String surname = "";
    private String patronymic = "";

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFIO() {
        StringBuilder answ = new StringBuilder().append(surname);
        if (name != "") {
            answ.append(" ").append(name.charAt(0)).append(".");
        }
        if (patronymic != "") {
            answ.append(patronymic.charAt(0)).append(".");
        }
        return answ.toString();
    }
}
