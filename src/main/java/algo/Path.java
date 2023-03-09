package main.java.algo;

import main.java.model.Component;

import java.util.Arrays;

public class Path {
    Component[] components;
    int totalRelevance;

    public Path(Component[] components) {
        this.components = components;
        this.totalRelevance = components[0].relevance + components[1].relevance + components[2].relevance + components[3].relevance;
    }

    @Override
    public String toString() {
        return "Path{" +
                "components=" + Arrays.toString(components) +
                ", totalRelevance=" + totalRelevance +
                '}';
    }
}