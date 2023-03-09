package main.java;

import main.java.model.Component;
import main.java.model.Game;
import main.java.model.Matrix;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> file = Reader.readFileRows("src/resources/00-example.txt");
        String[] gameData = file.get(0).split(" ");
        Game game = new Game(Integer.parseInt(gameData[0]), Integer.parseInt(gameData[1]), Integer.parseInt(gameData[2]));
        System.out.println(game);
        file.remove(0);
        // TODO Snake logic
        file.remove(0);
        // Skip the first 2 rows
        Component[][] components = new Component[game.rows][game.columns];
        System.out.println(file);
        for(int i = 0; i < file.size() ; i++) {
            String[] row = file.get(i).split(" ");
            for(int j = 0; j < row.length ; j++ ) {
                Component component = new Component();
                if(!row[j].equals("*")) {
                    component.relevance = Integer.parseInt(row[j]);
                    component.isWormhole = false;
                } else {
                    component.relevance = 0;
                    component.isWormhole = true;
                }
                component.x = j;
                component.y = i;
                components[i][j] = component;
            }
        }
        for (Component[] component : components) {
            for (Component row : component) {
                System.out.print(row + " ");
            }
            System.out.println("\n");
        }

        // Research algo




    }


}