package farmsimulator;

public class Main {

    public static void main(String[] args) {
             MilkingRobot milkingRobot = new MilkingRobot();
        Cow cow = new Cow();
        milkingRobot.milk(cow);
    }
}
