package main.java.model;

public class WormholeMove implements Move {

    public int value = 0;
    public int x;
    public int y;
    public String direction;

    public WormholeMove(int value, int x, int y, String direction) {
        this.value = value;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction + " " + x + " " + y + " ";
    }
}
