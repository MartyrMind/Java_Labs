package practs.pract_17.task_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        //получили данные из базы данных
        Student model  = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView(); //выводим данные на экран
        System.out.println("Обновляем данные модели...\n");
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Bob");
        student.setRollNo("11");
        return student;
    }
}
