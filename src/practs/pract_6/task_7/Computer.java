package practs.pract_6.task_7;

public class Computer {
    private Monitor monitor;
    private Processor processor;
    private Memory memory;
    private Models model;
    private int cost;


    public Computer(Monitor monitor, Processor processor, Memory memory, Models model) {
        this.monitor = monitor;
        this.processor = processor;
        this.memory = memory;
        this.model = model;
        cost = monitor.getCost() + processor.getCost() + monitor.getCost() + 100;
    }

    @Override
    public String toString() {
        return "Computer={model: " + model.title + ", cost: " + cost +"}";
    }

    public Models getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }
}


