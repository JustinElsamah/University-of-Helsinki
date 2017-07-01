package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private int udderCapacity;
    private Random rand;
    private double milkAmount;
    private final static String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this("unknown");
    }

    public Cow(String name) {
        rand = new Random();
        this.name = name;
        if (name.equals("unknown")) {
            this.name = NAMES[rand.nextInt(31)];
        }
        this.udderCapacity = rand.nextInt(26) + 15;
        this.milkAmount = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapacity;
    }

    public double getAmount() {
        return Math.floor(this.milkAmount);
    }

    @Override
    public double milk() {
        double temp = this.getAmount();
        this.milkAmount = 0;
        return temp;
    }

    @Override
    public void liveHour() {
        double tempRandom = (rand.nextInt(101) + 100) / 100.00;
        if (this.getAmount() + tempRandom > this.udderCapacity) {
            this.milkAmount = this.udderCapacity;
            return;
        }
        this.milkAmount += tempRandom;
        
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAmount() + "/" + this.getCapacity();
    }

}
