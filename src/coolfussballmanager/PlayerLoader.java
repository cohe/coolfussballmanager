
package coolfussballmanager;

import java.util.ArrayList;


public class PlayerLoader {
   ArrayList<Player> players = new ArrayList<>();
   
   PlayerLoader(){
       loadPlayers();
   }
   
   protected ArrayList getPlayers(){
       return this.players;
   }
    
    private void loadPlayers(){
        Common.println("Lade Spieler...");
        Player sokrates = new Player("Sokrates", "GRE", "Sturm", "Eintracht Weisheit", 1000000, 100, 30);
        players.add(sokrates);
        Player platon = new Player("Platon", "GRE", "Mittelfeld", "Eintracht Weisheit", 1000000, 100, 30);
        players.add(platon);
        Player einstein = new Player("Albert Einstein", "DEU", "Mittelfeld", "1. FC Naturwissenschaft", 150000, 80, 35);
        players.add(einstein);
        Player yogischwar = new Player("Janga Yogischwar", "DEU", "Sturm", "1. FC Naturwissenschaft", 150000, 80, 35);
        players.add(yogischwar);
        Player osbourne = new Player("Ozzy Osbourne", "USA", "Sturm", "AC Rock", 800000, 90, 20);
        players.add(yogischwar);
        Player jagger = new Player("Mick Jagger", "USA", "Sturm", "AC Rock", 800000, 80, 20);
        players.add(jagger);
        Player jackson = new Player("Michael Jackson", "USA", "Mittelfeld", "SC Popstars", 700000, 60, 40);
        players.add(jackson);
        Player madonna = new Player("Madonna", "UK", "Tor", "SC Popstars", 1000000, 30, 100);
        players.add(madonna);
        Player zeus = new Player("Zeus", "GRE", "Sturm", "SpVgg Götterfunken", 700000, 80, 20);
        players.add(zeus);
        Player allah = new Player("Allah", "ARA", "Mittelfeld", "SpVgg Götterfunken", 800000, 85, 30);
        players.add(allah);
        Player washington = new Player("George Washington", "USA", "Mittelfeld", "TSV Politikos", 1000000, 85, 40);
        players.add(washington);
        Player lincoln = new Player("Abraham Lincoln", "USA", "Tor", "TSV Politikos", 1000000, 20, 100);
        players.add(lincoln);
        Player trex= new Player("Tyrannosaurus Rex", "CAN", "Mittelfeld", "Jurassic FC", 750000, 80, 30);
        players.add(trex);
        Player raptor = new Player("Velociraptor", "CAN", "Sturm", "Jurassic FC", 750000, 90, 10);
        players.add(raptor);
        Player dean = new Player("James Dean", "USA", "Mittelfeld", "1. FC Kino", 500000, 30, 60);
        players.add(dean);
        Player caprio = new Player("Leonardo di Caprio", "USA", "Mittelfeld", "1. FC Kino", 800000, 75, 40);
        players.add(caprio);
        Player schiffer = new Player("Claudia Schiffer", "DEU", "Mittelfeld", "Inter Mode", 850000, 80, 20);
        players.add(schiffer);
        Player lagerfeld = new Player("Karl Lagerfeld", "DEU", "Sturm", "Inter Mode", 700000, 85, 10);
        players.add(lagerfeld);
        Player jordan = new Player("Michael \"Air\" Jordan", "USA", "Mittelfeld", "Sportfreunde Sportfreunde", 850000, 85, 25);
        players.add(jordan);
        Player ali = new Player("Mohammed Ali", "USA", "Tor", "Sportfreunde Sportfreunde", 850000, 20, 90);
        players.add(ali);
        Player stewart = new Player("Marie Stewart", "SCO", "Sturm", "SV Monarchie", 500000, 80, 15);
        players.add(stewart);
        Player große = new Player("Karl der Große", "DEU", "Mittelfeld", "SV Monarchie", 500000, 75, 25);
        players.add(große);
        Player goethe = new Player("Wolfgang Goethe", "DEU", "Mittelfeld", "SC Riptum", 750000, 80, 30);
        players.add(goethe);
        Player rowling = new Player("J. R. Rowling", "UK", "Tor", "SC Riptum", 800000, 15, 95);
        players.add(rowling);
        Player wayne = new Player("Bruce \"Batman\" Wayne", "deutsch", "Mittelfeld", "VfL Superhelden", 850000, 85, 40);
        players.add(wayne);
        Player parker = new Player("Peter \"Spiderman\" Parker", "deutsch", "Abwehr", "VfL Superhelden", 700000, 90, 30);
        players.add(parker);
        Player blauwal = new Player("Blauwal", "PAZ", "Mittelfeld", "AS Animali", 500000, 40, 65);
        players.add(blauwal);
        Player löwe = new Player("Löwe", "SIM", "Sturm", "AS Animali", 500000, 80, 40);
        players.add(löwe);
        Player mozart = new Player("Wolfgang Amadeus Mozart", "ÖST", "Mittelfeld", "SG Kompositum", 600000, 75, 35);
        players.add(mozart);
        Player beethoven = new Player("Ludwig van Beethoven", "DEU", "Sturm", "SG Kompositum", 900000, 70, 30);
        players.add(beethoven);
        Player mario = new Player("Super Mario", "deutsch", "Sturm", "TSV Video Games", 950000, 90, 35);
        players.add(mario);
        Player sonic = new Player("Sonic", "deutsch", "Abwehr", "TSV Video Games", 700000, 70, 70);
        players.add(sonic);
        Player skywalker = new Player("Luke Skywalker", "deutsch", "Sturm", "Inter Star Wars", 800000, 90, 30);
        players.add(skywalker);
        Player chewie = new Player("Chewbacca", "österreichisch", "Mittelfeld", "Inter Star Wars", 800000, 70, 40);
        players.add(chewie);
        Player veganer = new Player("Veganer", "deutsch", "Sturm", "SG Minderheiten", 500000, 50, 50);
        players.add(veganer);
        Player gothic = new Player("Gothic", "deutsch", "Sturm", "SG Minderheiten", 500000, 50, 50);
        players.add(gothic);
        for(Player player: players){
            Common.println(player.getName());
        }
    }
    
}
