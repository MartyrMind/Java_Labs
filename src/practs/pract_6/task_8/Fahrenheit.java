package practs.pract_6.task_8;

public class Fahrenheit implements Convertable{
    private double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void convert(Convertable from) {
        if (from instanceof Kelvin) {
            temperature = ((Kelvin) from).getTemperature() * 1.8 - 459;
        }
        if (from instanceof Celcius) {
            temperature = ((Celcius) from).getTemperature() * 1.8 + 32;
        }
        if (from instanceof Fahrenheit) {
            temperature = ((Fahrenheit) from).getTemperature();
        }
    }
}
