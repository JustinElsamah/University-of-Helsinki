package farmsimulator;

import java.util.Collection;

public class Barn {
    
    private BulkTank tank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
        milkingRobot = null;
    }
    
    public BulkTank getBulkTank(){
        
        return this.tank;
    
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow){
        try{
        milkingRobot.milk(cow);
        }catch (Exception e){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        
        for(Cow cow : cows){
            this.takeCareOf(cow);
        }
    }
    
    @Override
    public String toString(){
        return (this.tank.toString());
    }
}
