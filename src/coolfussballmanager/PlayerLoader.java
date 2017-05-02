
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
        Player pele = new Player("Pele", "brasilianisch", "Mittelfeld", "SpVgg Superstars", 1000000, 100, 30);
        players.add(pele);
        Player maradonna = new Player("Maradonna", "argentinisch", "Mittelfeld", "SpVgg Superstars", 1000000, 100, 30);
        players.add(maradonna);
        Player kagawa = new Player("Kagawa", "japanisch", "Mittelfeld", "Borussia Dortmund", 150000, 80, 35);
        players.add(kagawa);
        Player ricken = new Player("Ricken", "deutsch", "Mittelfeld", "Borussia Dortmund", 150000, 80, 35);
        players.add(ricken);
        Player seeler = new Player("Seeler", "deutsch", "Sturm", "Hamburger SV", 800000, 90, 20);
        players.add(seeler);
        Player vaart = new Player("van der Vaart", "niederländisch", "Mittelfeld", "Hamburger SV", 800000, 80, 20);
        players.add(vaart);
        Player thon = new Player("Thon", "deutsch", "Mittelfeld", "Schalke 04", 700000, 60, 40);
        players.add(thon);
        Player neuer = new Player("Neuer", "deutsch", "Tor", "Schalke 04", 1000000, 30, 100);
        players.add(neuer);
        Player polster = new Player("Polster", "österreichisch", "Sturm", "1. FC Köln", 700000, 80, 20);
        players.add(polster);
        Player poldi = new Player("Podolski", "deutsch", "Mittelfeld", "1. FC Köln", 800000, 85, 30);
        players.add(poldi);
        Player kaiser = new Player("Beckenbauer", "deutsch", "Mittelfeld", "Bayern München", 1000000, 85, 40);
        players.add(kaiser);
        Player kahn = new Player("Kahn", "deutsch", "Tor", "Bayern München", 1000000, 20, 100);
        players.add(kahn);
        Player balakov= new Player("Balakov", "bulgarisch", "Mittelfeld", "VfB Stuttgart", 750000, 80, 30);
        players.add(balakov);
        Player bobic = new Player("Bobic", "deutsch", "Sturm", "VfB Stuttgart", 750000, 90, 10);
        players.add(bobic);
        Player zecke = new Player("Neuendorf", "deutsch", "Mittelfeld", "Hertha BSC Berlin", 500000, 30, 60);
        players.add(zecke);
        Player deissler = new Player("Deißler", "deutsch", "Mittelfeld", "Hertha BSC Berlin", 800000, 75, 40);
        players.add(deissler);
        Player basler = new Player("Basler", "deutsch", "Mittelfeld", "Werder Bremen", 850000, 80, 20);
        players.add(basler);
        Player ailton = new Player("Ailton", "brasilianisch", "Sturm", "Werder Bremen", 700000, 85, 10);
        players.add(ailton);
        Player netzer = new Player("Netzer", "deutsch", "Mittelfeld", "Borussia Mönchengladbach", 850000, 85, 25);
        players.add(netzer);
        Player stegen = new Player("ter Stegen", "deutsch", "Tor", "Borussia Mönchengladbach", 850000, 20, 90);
        players.add(stegen);
        Player frey = new Player("Frey", "schweizerisch", "Sturm", "SC Freiburg", 500000, 80, 15);
        players.add(frey);
        Player iashvili = new Player("Iashvili", "N/A", "Mittelfeld", "SC Freiburg", 500000, 75, 25);
        players.add(iashvili);
        Player okocha = new Player("Okocha", "nigerianisch", "Mittelfeld", "Eintracht Frankfurt", 750000, 80, 30);
        players.add(okocha);
        Player koepke = new Player("Köpke", "deutsch", "Tor", "Eintracht Frankfurt", 800000, 15, 95);
        players.add(koepke);
        Player ballack = new Player("Ballack", "deutsch", "Mittelfeld", "Bayer Leverkusen", 850000, 85, 40);
        players.add(ballack);
        Player rudi = new Player("Völler", "deutsch", "Abwehr", "Bayer Leverkusen", 700000, 90, 30);
        players.add(rudi);
        Player stani = new Player("Stanislawski", "deutsch", "Mittelfeld", "Sankt Pauli", 500000, 40, 65);
        players.add(stani);
        Player ebbers = new Player("Ebbers", "deutsch", "Sturm", "Sankt Pauli", 500000, 80, 40);
        players.add(ebbers);
        Player wosz = new Player("Wosz", "deutsch", "Mittelfeld", "VfL Bochum", 600000, 75, 35);
        players.add(wosz);
        Player herbert = new Player("Grönemeyer", "deutsch", "Sturm", "VfL Bochum", 900000, 70, 30);
        players.add(herbert);
        Player walter = new Player("Walter", "deutsch", "Sturm", "FC Kaiserslautern", 950000, 90, 35);
        players.add(walter);
        Player brehme = new Player("Brehme", "deutsch", "Abwehr", "FC Kaiserslautern", 700000, 70, 70);
        players.add(brehme);
        Player winkler = new Player("Winkler", "deutsch", "Sturm", "1860 München", 800000, 90, 30);
        players.add(winkler);
        Player cerny = new Player("Cerny", "österreichisch", "Mittelfeld", "1860 München", 800000, 70, 40);
        players.add(cerny);
        Player custom1 = new Player("Custom1", "deutsch", "Sturm", "Selbsterstelltes Team", 500000, 50, 50);
        players.add(custom1);
        Player custom2 = new Player("Custom2", "deutsch", "Sturm", "Selbsterstelltes Team", 500000, 50, 50);
        players.add(custom2);
        for(Player player: players){
            Common.println(player.getName());
        }
    }
    
}
