
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maximumWeight;
    private int currentWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
    }

    public void addThing(Thing thing) {
        if (currentWeight + thing.getWeight() <= maximumWeight) {
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Thing heaviestThing(){
        int heaviestWeight = 0; 
        Thing heaviestThing = null;
       
        for(Thing thing:things){
            if(thing.getWeight() > heaviestWeight){
                heaviestThing = thing;
                heaviestWeight = thing.getWeight();
            }
        }
        return heaviestThing;
    }

    @Override
    public String toString() {
        if (things.size() > 1) {
            return things.size() + " things (" + this.currentWeight + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + this.currentWeight + " kg)";
        } else if (things.isEmpty()) {
            return "empty (" + this.currentWeight + " kg)";
        }
        return null;
    }

}
