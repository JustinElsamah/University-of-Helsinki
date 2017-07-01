
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private final Map<Bird, List<String>> birdDatabase = new HashMap<Bird, List<String>>();
    
    
    public void observe(Bird bird, String place) {
        if (!birdDatabase.containsKey(bird)) {
            birdDatabase.put(bird, new ArrayList<String>());
            birdDatabase.get(bird).add(place);
        } else {
            birdDatabase.get(bird).add(place);
        }
    }

    public void observations(Bird bird1) {
        boolean birdFound = false;
        for(Bird bird2: birdDatabase.keySet()){
            if(bird1.equals(bird2)){
                birdFound = true;
                System.out.println(bird1 + " observations: " + birdDatabase.get(bird2).size());
                for(String place:birdDatabase.get(bird2)){
                    System.out.println(place);
                }
            }
        }
        if(!birdFound){
            System.out.println(bird1 + " observations: 0");
        }
        
    }

}
