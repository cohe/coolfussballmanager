
package coolfussballmanager;

import java.util.ArrayList;


public class TeamLoader {
   ArrayList<Team> teams = new ArrayList<>();
   
   TeamLoader(){
       loadTeams();
   }
   
   protected ArrayList getTeams(){
       return this.teams;
   }
    
    private void loadTeams(){
        Common.println("Lade Mannschaften...");
        Team superstars = new Team("SpVgg Superstars");
        teams.add(superstars);
        Team bvb = new Team("Borussia Dortmund");
        teams.add(bvb);
        Team hsv = new Team("Hamburger SV");
        teams.add(hsv);
        Team schalke = new Team("Schalke 04");
        teams.add(schalke);
        Team koeln = new Team("1. FC Köln");
        teams.add(koeln);
        Team bayern = new Team("Bayern München");
        teams.add(bayern);
        Team vfb = new Team("VfB Stuttgart");
        teams.add(vfb);
        Team hertha = new Team("Hertha BSC Berlin");
        teams.add(hertha);
        Team werder = new Team("Werder Bremen");
        teams.add(werder);
        Team gladbach = new Team("Borussia Mönchengladbach");
        teams.add(gladbach);
        Team freiburg = new Team("SC Freiburg");
        teams.add(freiburg);
        Team eintracht = new Team("Eintracht Frankfurt");
        teams.add(eintracht);
        Team bayer = new Team("Bayer Leverkusen");
        teams.add(bayer);
        Team pauli = new Team("Sankt Pauli");
        teams.add(pauli);
        Team vfl = new Team("VfL Bochum");
        teams.add(vfl);
        Team lautern = new Team("FC Kaiserslautern");
        teams.add(lautern);
        Team sechzig = new Team("1860 München");
        teams.add(sechzig);
        Team custom = new Team("Selbsterstelltes Team");
        teams.add(custom);
        
        for(Team team: teams){
            Common.println(team.getName());
        }
    }
    
}

