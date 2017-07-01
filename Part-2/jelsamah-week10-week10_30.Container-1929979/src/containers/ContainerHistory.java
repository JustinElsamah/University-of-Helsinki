package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private final List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();

    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if(history.isEmpty()){
            return 0;
        }
        double maxValue = history.get(0);
        for (Double situation : history) {
            if (maxValue < situation) {
                maxValue = situation;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if(history.isEmpty()){
            return 0;
        }
        double minValue = history.get(0);
        for (Double situation : history) {
            if (minValue > situation) {
                minValue = situation;
            }
        }
        return minValue;
    }

    public double average() {
        double sum = 0;
        for (Double situation : history) {
            sum += situation;
        }
        if(history.isEmpty()){
            return 0;
        }
        return sum / history.size();
    }
    
    public double greatestFluctuation(){
        
        if(history.size() < 2){
            return 0;
        }
        double greatestFluctuation = 0;
        double temp = history.get(0);
        
        for (Double situation : history) {
            if(Math.abs(temp-situation) > greatestFluctuation){
                greatestFluctuation = Math.abs(temp-situation);
            }
            temp = situation;
        }
        
        return Math.abs(greatestFluctuation);
    }
    
    public double variance(){
        double sum = 0;
        if(history.size() < 2){
            return 0;
        }
        for(Double situation:history){
            sum += Math.pow(situation - this.average(), 2);
        }
        return sum /= history.size()-1;
    }

}
