package practs.pract_7.task_4;

public class Journal implements Printable {
    private String title;
    private String date;

    public Journal(String title, String date) {
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Журнал:" + "\n\tНазвание: " + title + "\n\tДата выпуска: " + date;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
