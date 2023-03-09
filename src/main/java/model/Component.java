package main.java.model;

public class Component implements Comparable{
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

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public void setWormhole(boolean wormhole) {
        isWormhole = wormhole;
    }

    public boolean isHasSnake() {
        return hasSnake;
    }

    public void setHasSnake(boolean hasSnake) {
        this.hasSnake = hasSnake;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    @Override
    public int compareTo(Object o) {
        Component comparing = (Component) o;
        if(null == o) return -1;
        return comparing.relevance - this.relevance;
    }
}
