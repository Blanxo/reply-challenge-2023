package main.java.algo;

import main.java.model.Component;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Solution {

    LinkedList<Integer> adj;

    private Component[][] map;

    public Solution(Component[][] map) {
        this.map = map;
    }

    public List getPath() {

        List<Integer> path = new ArrayList<>();
        Point max = getMax();
        System.out.println(max);

        return path;
    }

    public Point getMax() {

        Point max = new Point();
        Integer value = null;
        for (Component[] row : map) {
            for (Component column : row) {
                if (!column.hasSnake) {
                    value = column.getRelevance();
                    break;
                }
            }
            if (value != null) break;
        }

        for (Component[] row : map) {
            for (Component column : row) {
                if (column.getRelevance() > value && !column.hasSnake) {
                    value = column.getRelevance();
                    max.setLocation(column.getX(), column.getY());
                }
            }
        }
        return max;
    }

    public Path findHighestPath(int n) {
        Path highestPath = null;

        // Loop over all cells in the map
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Component[] components = new Component[n];

                // Check if the first component is valid
                Component c1 = map[i][j];
                if (c1 != null) {
                    components[0] = c1;

                    // Look for the remaining components
                    if (findRemainingComponents(map, components, 1, i, j)) {

                        // Compute the total relevance of the path
                        Path path = new Path(components);

                        // Update the highest path if necessary
                        if (highestPath == null || path.totalRelevance > highestPath.totalRelevance) {
                            highestPath = path;
                        }
                    }
                }
            }
        }
        return highestPath;
    }

    private boolean findRemainingComponents(Component[][] map, Component[] components, int index, int i, int j) {
        if (index >= components.length) {
            // Found all components
            return true;
        }

        // Look for the next component
        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                if (k >= 0 && k < map.length && l >= 0 && l < map[k].length) {
                    Component c = map[k][l];
                    if(c.hasSnake) continue;
                    // Check if the component is valid and adjacent to the previous one
                    if (c != null && isAdjacent(components[index-1], c) && !containsComponent(components, c, index)) {
                        components[index] = c;

                        // Recursively look for the remaining components
                        if (findRemainingComponents(map, components, index+1, k, l)) {
                            return true;
                        }
                    }
                }
            }
        }
        // Could not find the remaining components
        return false;
    }

    private boolean isAdjacent(Component c1, Component c2) {
        int dx = Math.abs(c1.x - c2.x);
        int dy = Math.abs(c1.y - c2.y);
        return (dx == 1 && dy == 0) || (dx == 0 && dy == 1);
    }

    private boolean containsComponent(Component[] components, Component c, int n) {
        for (int i = 0; i < n; i++) {
            if (components[i] == c) {
                return true;
            }
        }
        return false;
    }

}