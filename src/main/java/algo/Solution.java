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

    public Path findHighestPath() {
        Path highestPath = null;

        // Loop over all cells in the map
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Component c1 = map[i][j];

                // Check if the first component is valid
                if (c1 != null) {

                    // Look for the second component
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < map.length && l >= 0 && l < map[k].length) {
                                Component c2 = map[k][l];

                                // Check if the second component is valid and different from the first
                                if (c2 != null && c2 != c1) {

                                    // Look for the third component
                                    for (int m = k - 1; m <= k + 1; m++) {
                                        for (int n = l - 1; n <= l + 1; n++) {
                                            if (m >= 0 && m < map.length && n >= 0 && n < map[m].length) {
                                                Component c3 = map[m][n];

                                                // Check if the third component is valid and different from the first two
                                                if (c3 != null && c3 != c1 && c3 != c2) {
// Look for the fourth component
                                                    for (int o = m - 1; o <= m + 1; o++) {
                                                        for (int p = n - 1; p <= n + 1; p++) {
                                                            if (o >= 0 && o < map.length && p >= 0 && p < map[o].length) {
                                                                Component c4 = map[o][p];

                                                                // Check if the fourth component is valid and different from the first three
                                                                if (c4 != null && c4 != c1 && c4 != c2 && c4 != c3) {

                                                                    // Compute the total relevance of the path
                                                                    Path path = new Path(new Component[]{c1, c2, c3, c4});

                                                                    // Update the highest path if necessary
                                                                    if (highestPath == null || path.totalRelevance > highestPath.totalRelevance) {
                                                                        highestPath = path;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return highestPath;
    }


}