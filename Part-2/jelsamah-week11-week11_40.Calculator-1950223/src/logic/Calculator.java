package logic;

public class Calculator {
 
    private int value;
    
    public Calculator(){
        this.value = 0;
    }
    
    public void addToCalculator(String num){
        this.value += Integer.parseInt(num);
    }
    
    public void subtractFromCalculator(String num){
        this.value -= Integer.parseInt(num);
    }
    
    public void resetCalculator(){
        this.value = 0;
    }
    
    public String getValue(){
        return Integer.toString(value);
    }
    
}
