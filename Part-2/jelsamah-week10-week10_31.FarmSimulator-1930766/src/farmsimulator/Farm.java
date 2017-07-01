package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive{
    private String ownerName;
    private Barn barn;
    private List<Cow> herd;
    
    public Farm(String ownerName, Barn barn){
        this.ownerName = ownerName;
        this.barn = barn;
        herd = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow){
        herd.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
    
    public String getOwner(){
        return this.ownerName;
    }

    @Override
    public void liveHour() {
        for(Cow cow:herd){
            cow.liveHour();
        }
    }
    public void manageCows(){
        barn.takeCareOf(herd);
    }
}
