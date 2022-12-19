package practs.pract_17.task_2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    private Map<String, Integer> positions = new HashMap<String, Integer>();
    private Map<Integer, Double> experience = new HashMap<Integer, Double>();

    private int calculateSalary() {
        int salary = positions.get(model.getPosition());
        salary *= experience.get(model.getExperience());
        return salary;
    }

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;

        positions.put("junior", 1000);
        positions.put("middle", 2000);
        positions.put("senior", 3000);

        experience.put(2, 0.6);
        experience.put(3, 0.65);
        experience.put(4, 0.7);
        experience.put(5, 0.75);
        experience.put(6, 1.0);
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public String getEmployeeName(){
        return model.getName();
    }

    public void setEmployeePosition(String position){
        model.setPosition(position);
    }

    public String getEmployeePosition(){
        return model.getPosition();
    }

    public void setEmployeeExperience(int experience){
        model.setExperience(experience);
    }

    public int getEmployeeExperience(){
        return model.getExperience();
    }


    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getPosition(), calculateSalary());
    }
}
