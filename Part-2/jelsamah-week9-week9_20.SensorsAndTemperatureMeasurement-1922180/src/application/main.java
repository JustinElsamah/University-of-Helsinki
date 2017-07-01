package application;

public class main {

    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new ConstantSensor(4));
        System.out.println(ka.measure());
    }
    
}
