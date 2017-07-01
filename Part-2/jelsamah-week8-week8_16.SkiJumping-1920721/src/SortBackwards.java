
import java.util.Comparator;

public class SortBackwards implements Comparator<Jumper>{
    @Override
    public int compare(Jumper jumper1, Jumper jumper2){
        return jumper2.getPoints()-jumper1.getPoints();
    }
}
