/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinelsamah
 */
import java.util.*;

public class Team {

    private String name;
    private int maxSize = 16;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if(!(players.size() >= this.maxSize)){
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return players.size();
    }

    public int goals(){
        int goals = 0;
        for(Player player:players){
            goals += player.goals();
        }
        return goals;
    }
}
