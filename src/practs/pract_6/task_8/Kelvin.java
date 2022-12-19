package practs.pract_6.task_8;

public class Kelvin implements Convertable{
    private double temperature;

    public Kelvin(double temperature) {
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
        if (from instanceof Celcius) {
            temperature = ((Celcius) from).getTemperature() + 273;
        }
        if (from instanceof Fahrenheit) {
            temperature = (((Fahrenheit) from).getTemperature() + 459) / 1.8;
        }
        if (from instanceof Kelvin)
            temperature = ((Kelvin) from).getTemperature();
    }

}
