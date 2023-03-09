package main.java.algo;

import main.java.model.Component;

import java.util.Arrays;

public class Path {
    public Component[] components;
    public int totalRelevance;

    public Path(Component[] components) {
        this.components = components;
        this.totalRelevance = 0;
        for (Component c : components) {
            this.totalRelevance += c.relevance;
        }
    }

    @Override
    public String toString() {
        return "Path{" +
                "components=" + Arrays.toString(components) +
                ", totalRelevance=" + totalRelevance +
                '}';
    }
}