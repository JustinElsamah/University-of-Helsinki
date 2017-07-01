package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private final int maximumVolume;
    private int currentVolume;
    private ArrayList<Thing> things;

    public Box(int maximumVolume) {
        this.things = new ArrayList<Thing>();
        this.maximumVolume = maximumVolume;
    }

    public boolean addThing(Thing thing) {
        if (currentVolume + thing.getVolume() <= maximumVolume) {
            things.add(thing);
            currentVolume += thing.getVolume();
            return true;
        }
        return false;

    }

    @Override
    public int getVolume() {
        return currentVolume;
    }
    
    

}
