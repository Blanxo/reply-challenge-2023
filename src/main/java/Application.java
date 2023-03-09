package main.java;

import main.java.model.Demon;
import main.java.model.Game;
import main.java.model.Pandora;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> file = Reader.readFileRows("src/resources/00-example.txt");
        String[] gameData = file.get(0).split(" ");
        file.remove(0);
        Pandora pandora = new Pandora(Integer.parseInt(gameData[0]), Integer.parseInt(gameData[0]), Integer.parseInt(gameData[1]));
        Game game = new Game(Integer.parseInt(gameData[2]), 0, Integer.parseInt(gameData[3]), 0);
        List<Demon> demons = new ArrayList<>();
        for (String remainingRow : file) {
            String[] demonData = remainingRow.split(" ");
            Demon demon = new Demon(Integer.parseInt(demonData[0]), Integer.parseInt(demonData[1]), Integer.parseInt(demonData[2]), Integer.parseInt(demonData[3]));
            List<Integer> rewards = new ArrayList<>();
            for (int i = 4; i < demonData.length; i++ ) {
                rewards.add(Integer.parseInt(demonData[i]));
            }
            demon.rewards = rewards;
            demons.add(demon);
        }
        System.out.println(pandora);
        System.out.println(game);
        System.out.println(demons);
    }


}