package farmsimulator;

public class MilkingRobot {
    
    private BulkTank bulkTank;
    
    public MilkingRobot(){
        bulkTank = null;
    }
    
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    
    public void setBulkTank(BulkTank bulkTank){
        this.bulkTank = bulkTank;   
    }
    
    public void milk(Milkable milkable){
        try{
        bulkTank.addToTank(milkable.milk());
        }catch (Exception e){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }
    
}
