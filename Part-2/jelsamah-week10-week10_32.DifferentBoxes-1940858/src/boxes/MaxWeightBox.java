package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{

    private int maxWeight;
    private List<Thing> thingsInBox = new ArrayList<Thing>();
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    @Override
    public void add(Thing thing) {
        if(this.boxWeight() + thing.getWeight() <= maxWeight){
            thingsInBox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing otherThing:thingsInBox){
            if(otherThing.equals(thing)){
                return true;
            }
        }
        return false;
    }
    
    public int boxWeight(){
        int weight = 0;
        for(Thing thing:thingsInBox){
            weight += thing.getWeight();
        }
        return weight;
    }

}
