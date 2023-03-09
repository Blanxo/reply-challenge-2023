package main.java.model;

public class Component {
    public int relevance;
    public boolean isWormhole;
    public boolean hasSnake;
    public int x;
    public int y;

    public Component(int relevance, boolean isWormhole, int x, int y) {
        this.relevance = relevance;
        this.isWormhole = isWormhole;
        this.x = x;
        this.y = y;
    }

    public Component() {
    }

    @Override
    public String toString() {
        return isWormhole() + "{" +
                "relevance=" + relevance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String isWormhole() {
        return isWormhole ? "Wormhole" : "Cell";
    }
}
