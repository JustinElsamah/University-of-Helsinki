package application;

import java.util.Random;

public class Thermometer implements Sensor {

    //State == false is off, State == true is on.
    private Boolean state;
    private Random random = new Random();

    public Thermometer() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if (state) {
            return random.nextInt(61) - 30;
        }
        throw new IllegalStateException();
    }

}
