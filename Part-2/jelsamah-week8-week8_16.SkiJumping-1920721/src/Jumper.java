import java.util.ArrayList;
import java.util.Random;

public class Jumper implements Comparable<Jumper>{

    private final String name;
    private int points;
    private final Random rand = new Random();
    private String jumpLengths = "";
    
    public Jumper(String name){
        this.name = name;
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }
    
    public void addPoints(int points){
        this.points += points;
    }
    
    public String jumpLengths(){
            return jumpLengths;
    }
    
    public ArrayList<Integer> judge(){
        final int arrSize = 5;
        ArrayList<Integer> judges = new ArrayList<Integer>();
        for(int i = 0; i < arrSize; i++){
            judges.add(rand.nextInt(11) + 10);
        }
        return judges;
    }
    
    public int jump(){
        int length = rand.nextInt(61) + 60;
        this.jumpLengths = this.jumpLengths.concat(length + " m, ");
        return length;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Jumper jumper){
        return this.points - jumper.points;
    }
    
}
