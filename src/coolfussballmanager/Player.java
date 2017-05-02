package coolfussballmanager;

public class Player {
    
// final oder static für nicht-veränderbare Attribute?
    private final String name;
    private final String nation;
    private final String position;

// aktueller Zustand    
    private String team;
    private int health;
    private int price;
    
// Fähigkeiten
    private int attack;
    private int defend;
    
    Player(String name, String nation, String position, String team, int price, int attack, int defend){
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.team = team;
        this.health = 100;
        this.price = price;
        this.attack = attack;
        this.defend = defend;
    }
    
    private void pass(Player opponent){
        
    }
    
    private void shoot(Player opponent){
        
    }
    
    private void regenerate(){
        this.health = 100;
    }
    
    private void increasePrice(int percent){
        this.price += this.price/100*percent;
    }
    
    private void decreasePrice(int percent){
        this.price -= this.price/100*percent;
    }
    
    protected String getName(){
        return this.name;
    }
    
    protected String getTeam(){
        return this.team;
    }
    
    private void setTeam(String team){
        this.team = team;
    }
    
    private void increaseAttack(int percent){
        this.attack += this.attack/100*percent;
    }
    
    private void decreaseAttack(int percent){
        this.attack -= this.attack/100*percent;
    
    }
     private void increaseDefend(int percent){
        this.defend += this.defend/100*percent;
    }
    
    private void decreaseDefend(int percent){
        this.defend -= this.defend/100*percent;
    }   
    
}
