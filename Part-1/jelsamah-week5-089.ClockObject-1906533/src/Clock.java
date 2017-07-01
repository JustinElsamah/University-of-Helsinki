public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        if(seconds.getValue() == 59){
                    if(minutes.getValue() == 59){
                        hours.next();
                    }
                    minutes.next();
                }
                seconds.next();
    }
    
    public String toString() {
        
        return hours + ":" + minutes + ":" + seconds;
    }
}
