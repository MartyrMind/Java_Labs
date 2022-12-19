package practs.pract_6.task_8;

public class Celcius implements Convertable {
    private double temperature;

    public Celcius(double temperature) {
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
        if (from instanceof Fahrenheit) {
            temperature = (((Fahrenheit) from).getTemperature() - 32) / 1.8;
        }
        if (from instanceof Celcius) {
            temperature = ((Celcius) from).getTemperature();
        }

        if (from instanceof Kelvin) {
            temperature = ((Kelvin) from).getTemperature() - 273;
        }
    }
}
