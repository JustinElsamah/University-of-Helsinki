import java.util.*;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;
    
    public Hand(){
        hand = new ArrayList<Card>();
    }
        
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card:hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int value(Hand hand){
        int handValue = 0;
        for(Card card: hand.hand){
            handValue += card.getValue();
        }
        return handValue;
    }
    
    @Override
    public int compareTo(Hand hand){
        return value(this) - value(hand);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
