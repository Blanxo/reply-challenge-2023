package main.java;

import main.java.algo.Path;
import main.java.algo.Solution;
import main.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> file = Reader.readFileRows("src/resources/00-example.txt");
        String[] gameData = file.get(0).split(" ");
        Game game = new Game(Integer.parseInt(gameData[0]), Integer.parseInt(gameData[1]), Integer.parseInt(gameData[2]));
        System.out.println(game);
        file.remove(0);
        List<Snake> snakes = new ArrayList<>();
        for(String snakeSize : file.get(0).split(" ")) {
            Snake snake = new Snake(Integer.parseInt(snakeSize));
            snakes.add(snake);
        }
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
        /*for (Component[] component : components) {
            for (Component row : component) {
                System.out.print(row + " ");
            }
            System.out.println("\n");
        }*/
        System.out.println(snakes);
        // Research algo
        Solution solution = new Solution(components);
        Path path = solution.findHighestPath(6);
        for(Component pathComponent : path.components) {
            pathComponent.setHasSnake(true);
        }
        System.out.println(path);
        path = solution.findHighestPath(7);
        for(Component pathComponent : path.components) {
            pathComponent.setHasSnake(true);
        }
        System.out.println(path);
        path = solution.findHighestPath(5);
        for(Component pathComponent : path.components) {
            pathComponent.setHasSnake(true);
        }
        System.out.println(path);
        path = solution.findHighestPath(3);
        for(Component pathComponent : path.components) {
            pathComponent.setHasSnake(true);
        }
        System.out.println(path);
        path = solution.findHighestPath(3);
        for(Component pathComponent : path.components) {
            pathComponent.setHasSnake(true);
        }
        System.out.println(path);
    }


}