
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }
    
    public Money minus(Money decremented){
        int euros = this.euros - decremented.euros;
        int cents = this.cents - decremented.cents;
        if(less(decremented)){
            euros = 0;
            cents = 0;
        }else if(cents < 0){
            euros--;
            cents += 100;
        }
        
        return new Money(euros, cents);
 
        
    }
    
    public boolean less(Money compared){
    
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    

}
