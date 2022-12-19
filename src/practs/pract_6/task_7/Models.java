package practs.pract_6.task_7;

public enum Models {
    IBM ("IBM"),
    MACBOOK ("MacBook"),
    DRAGON32 ("Dragon32"),
    DEFAULT("NoName");

    String title;

    Models(String title) {
        this.title = title;
    }
}
