package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Thing;
import moving.domain.Box;

public class Packer {

    private final int boxesVolume;
    private ArrayList<Box> boxes = new ArrayList<Box>();

    public Packer(int boxesVolume) {

        this.boxesVolume = boxesVolume;

    }

    public List<Box> packThings(List<Thing> things) {
        Box tempBox = new Box(boxesVolume);
        for (Thing thing : things) {
            if (tempBox.getVolume() + thing.getVolume() <= boxesVolume) {
                tempBox.addThing(thing);
            } else {
                boxes.add(tempBox);
                tempBox = new Box(boxesVolume);
                tempBox.addThing(thing);
            }
        }
        boxes.add(tempBox);
        return boxes;
    }

}
