/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinelsamah
 */
public class Birds {
    private String name;
    private String latinName;
    private int numOfOccurences = 0;
    
    public Birds(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getNumOfOccurences() {
        return numOfOccurences;
    }

    public void increaseNumOfOccurences() {
        
        this.numOfOccurences++;
    }
    
    public String toString(){
        return (this.name + " (" + this.latinName + "): " + this.numOfOccurences + " Observations");
    }
    
    
}
