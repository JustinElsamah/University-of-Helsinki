package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{

    private List<Thing> thingsInBox = new ArrayList<Thing>();
    
    
    
    @Override
    public void add(Thing thing) {
            thingsInBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
    
    

}
