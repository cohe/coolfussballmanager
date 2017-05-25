
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
        Team superstars = new Team("Eintracht Weisheit");
        teams.add(superstars);
        Team bvb = new Team("1. FC Naturwissenschaft");
        teams.add(bvb);
        Team hsv = new Team("AC Rock");
        teams.add(hsv);
        Team schalke = new Team("SC Popstars");
        teams.add(schalke);
        Team koeln = new Team("SpVgg Götterfunken");
        teams.add(koeln);
        Team bayern = new Team("TSV Politikos");
        teams.add(bayern);
        Team vfb = new Team("Jurassic FC");
        teams.add(vfb);
        Team hertha = new Team("1. FC Kino");
        teams.add(hertha);
        Team werder = new Team("Inter Mode");
        teams.add(werder);
        Team gladbach = new Team("Sportfreunde Sportfreunde");
        teams.add(gladbach);
        Team freiburg = new Team("SV Monarchie");
        teams.add(freiburg);
        Team eintracht = new Team("SC Riptum");
        teams.add(eintracht);
        Team bayer = new Team("VfL Superhelden");
        teams.add(bayer);
        Team pauli = new Team("AS Animali");
        teams.add(pauli);
        Team vfl = new Team("SG Kompositum");
        teams.add(vfl);
        Team lautern = new Team("TSV Video Games");
        teams.add(lautern);
        Team sechzig = new Team("Inter Star Wars");
        teams.add(sechzig);
        Team custom = new Team("SG Minderheiten");
        teams.add(custom);
        
        for(Team team: teams){
            Common.println(team.getName());
        }
    }
    
}

