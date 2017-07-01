public class Calculator {
    private Reader reader = new Reader();
    private int calculationsDone = 0;
    
    private void sum(){
        System.out.println("Value1:");
        int Value1 = reader.readInteger();
        System.out.println("Value2:");
        int Value2 = reader.readInteger();
        System.out.println("sum of the values " + (Value1 + Value2));
        calculationsDone++;
    }
    
    private void difference(){
        System.out.println("Value1:");
        int Value1 = reader.readInteger();
        System.out.println("Value2:");
        int Value2 = reader.readInteger();
        System.out.println("difference of the values " + (Value1 - Value2));
        calculationsDone++;
    }
    
    private void product(){
        System.out.println("Value1:");
        int Value1 = reader.readInteger();
        System.out.println("Value2:");
        int Value2 = reader.readInteger();
        System.out.println("product of the values " + (Value1 * Value2));
        calculationsDone++;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + calculationsDone);
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
