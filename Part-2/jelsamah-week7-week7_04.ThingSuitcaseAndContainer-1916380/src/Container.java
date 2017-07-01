
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int currentWeight = 0;
    private int maximumWeight = 0;

    public Container(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (currentWeight + suitcase.totalWeight() <= this.maximumWeight) {
            currentWeight += suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }

}
