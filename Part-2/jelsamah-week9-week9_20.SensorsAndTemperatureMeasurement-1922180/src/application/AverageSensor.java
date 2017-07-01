package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> measures;

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        measures = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int measure = 0;
        for (Sensor sensor : sensors) {
            measure += sensor.measure();
        }
        this.measures.add(measure/this.sensors.size());
        return measure / this.sensors.size();
    }
    
    public List<Integer> readings(){
        return measures;
    }

}
