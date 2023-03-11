package pl.javastart.task;

public class Room {
    private double area;
    private double temperature;
    private boolean isAirConditioned;
    private double lowerLimitTemperature;

    public double getArea() {
        return area;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isAirConditioned() {
        return isAirConditioned;
    }

    public double getLowerLimitTemperature() {
        return lowerLimitTemperature;
    }

    public Room(double area, double temperature, boolean isAirConditioned, double lowerLimitTemperature) {
        this.area = area;
        this.temperature = temperature;
        this.isAirConditioned = isAirConditioned;
        this.lowerLimitTemperature = lowerLimitTemperature;
    }

    private void checkTemperature() {
        if (temperature < lowerLimitTemperature && isAirConditioned) {
            temperature = lowerLimitTemperature;
        }
    }
    boolean reduceTemperature() {
        checkTemperature();
        if (isAirConditioned) {
            if ((temperature - 1) <= lowerLimitTemperature) {
                temperature = lowerLimitTemperature;
                return false;
            } else if (temperature > lowerLimitTemperature) {
                temperature--;
                return true;
            }
        }
        return false;
    }
}
