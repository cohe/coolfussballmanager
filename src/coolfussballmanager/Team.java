package coolfussballmanager;

import java.util.ArrayList;

public class Team {
    private final String name;
    private double value;
    private int points;
    private int goals;
    private int goalsAgainst;
    private boolean hasBall;
    public ArrayList<Player> players = new ArrayList<>();
    
    Team(String name){
        this.name = name;
    }
    
    protected String getName(){
        return this.name;
    }
  
    protected void addPlayer(Player player){
        System.out.println(player.getName() + " -> " + this.name);
        this.players.add(player);
    }
    
}
