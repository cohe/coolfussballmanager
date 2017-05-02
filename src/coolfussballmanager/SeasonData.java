package coolfussballmanager;

import java.util.ArrayList;

public class SeasonData {
    
    
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    
    SeasonData(){ 
        loadSeasonData();
    }
    
    private void loadSeasonData(){
        Common.println("Lade Saisondaten...");
        TeamLoader tl = new TeamLoader();
        this.teams = tl.getTeams();
        PlayerLoader pl = new PlayerLoader();
        this.players = pl.getPlayers();
        distributePlayers(teams, players);      
    }
    
    private void distributePlayers(ArrayList<Team> teams, ArrayList<Player> players){
        Common.println("Verteile Spieler...");
        for(Team team: teams){
            for(Player player: players){
                if(team.getName().equals(player.getTeam())){
                    team.addPlayer(player);
                }
            }
        }
    }
}
