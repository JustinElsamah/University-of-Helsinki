package boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box{

    private List<Thing> thingsInBox = new ArrayList<Thing>();
    
    
    
    @Override
    public void add(Thing thing) {
        if(this.isOneThing()){
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
    
    public boolean isOneThing(){
        int things = 0;
        for(Thing thing:thingsInBox){
           things++;
        }
        if(things >= 1){
            return false;
        }
        return true;
        
    }
    
    

}
