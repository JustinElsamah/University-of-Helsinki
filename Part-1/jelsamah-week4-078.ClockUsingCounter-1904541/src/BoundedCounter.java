/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinelsamah
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {

        this.upperLimit = upperLimit;

    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value >= 10) {
            return "" + this.value;
        } else {
            return "0" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value > 0 && value <= this.upperLimit) {
            this.value = value;
        }
    }

}
