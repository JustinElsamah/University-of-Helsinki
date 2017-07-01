
import java.util.ArrayList;
import java.util.Collections;

public class Jumpers {

    private ArrayList<Jumper> jumpers;

    public Jumpers() {
        jumpers = new ArrayList<Jumper>();
    }

    public void add(Jumper jumper) {
        jumpers.add(jumper);
    }

    public void sortBackwards(){
        Collections.sort(this.jumpers, new SortBackwards());
    }
    
    public void sortJumpers() {
        Collections.sort(this.jumpers);
    }

    public void listJumpers() {
        int i = 1;

        for (Jumper jumper : this.jumpers) {
            System.out.println("  " + i + ". " + jumper.getName() + " (" + jumper.getPoints() + " points)");
            i++;
        }
    }
    
    public void endScreen(){
        int i = 1;
        for(Jumper jumper:jumpers){
            System.out.println(i + "           " + jumper.getName() + " (" + jumper.getPoints() + " points)");
            System.out.println("            jump lengths: " + jumper.jumpLengths().trim().substring(0, jumper.jumpLengths().length()-2));
            i++;
        }
    }
    
    public void results(){
        int length;
        int pointsGained;
        ArrayList<Integer> judges = new ArrayList<Integer>();
        for(Jumper jumper : jumpers){
            length = jumper.jump();
            judges = jumper.judge();
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + length);
            System.out.println("    judge votes: " + judges + "\n");
            Collections.sort(judges);
            pointsGained = length + judges.get(1) + judges.get(2) + judges.get(3);
            jumper.addPoints(pointsGained);
        }
    }
}
