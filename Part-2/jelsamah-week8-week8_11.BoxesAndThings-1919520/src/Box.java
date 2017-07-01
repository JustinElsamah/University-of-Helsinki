
import java.util.*;

public class Box implements ToBeStored{

    private ArrayList<ToBeStored> storables;
    private double maximumWeight;

    public Box(double maximumWeight) {
        this.storables = new ArrayList<ToBeStored>();
        this.maximumWeight = maximumWeight;
    }

    public void add(ToBeStored storable) {
        if (this.weight() + storable.weight() <= this.maximumWeight) {
            this.storables.add(storable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + storables.size() + " things, total weight " + this.weight() + " kg";
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored storable: storables){
            weight += storable.weight();
        }
        return weight;
    }

}
