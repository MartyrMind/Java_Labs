package practs.pract_17.task_2;

public class Demo {

    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Bob");
        employee.setPosition("junior");
        employee.setExperience(5);
        return employee;
    }
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        System.out.println("Обновляем данные модели...\n");
        controller.setEmployeePosition("senior");
        controller.updateView();

        System.out.println("Обновляем данные модели...\n");
        controller.setEmployeeExperience(6);
        controller.updateView();

    }
}
